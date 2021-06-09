package com.github.soni291196.grpc.calculator.client;

import com.github.soni291196.grpc.greeting.client.GreetingClient;
import com.proto.calculator.*;
import com.proto.greet.GreetEveryoneRequest;
import com.proto.greet.GreetManyTimesRequest;
import com.proto.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC Client");

        CalculatorClient main = new CalculatorClient();
        main.run();
    }

    private void run(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50052).usePlaintext().build();
        // doUnaryCall(channel);
        // doServerStreamingCall(channel);
        // doClientStreamingCall(channel);
        // doBiDiStreamingCall(channel);
        doErrorCall(channel);
        System.out.println("Shutting down channel");
        channel.shutdown();
    }

    private void doUnaryCall(ManagedChannel channel) {
        System.out.println("Creating Stub");

        // Unary
        // created a sum calculator service client (blocking - synchronous)
        SumCalculatorServiceGrpc.SumCalculatorServiceBlockingStub sumCalculatorClient = SumCalculatorServiceGrpc.newBlockingStub(channel);

        // created a protocol buffer numbers message
        Numbers numbers = Numbers.newBuilder()
                .setFirstNum(3.0f)
                .setSecondNum(10.0f)
                .build();

        // do the same for a CalculatorRequest
        CalculatorRequest calculatorRequest = CalculatorRequest.newBuilder().setNumbers(numbers).build();

        // call the RPC and get back a CalculatorResponse (protocol buffers)
        CalculatorResponse calculatorResponse = sumCalculatorClient.sum(calculatorRequest);
        System.out.println(calculatorResponse.getResult());
    }

    private void doServerStreamingCall(ManagedChannel channel) {
        // Server Streaming
        // we prepare the request
        PrimeDecompositionServiceGrpc.PrimeDecompositionServiceBlockingStub primeDecompositionClient = PrimeDecompositionServiceGrpc.newBlockingStub(channel);

        PrimeDecompositionRequest primeDecompositionRequest = PrimeDecompositionRequest.newBuilder()
                .setNumber(2400)
                .build();

        // we stream the responses (in a blocking manner)
        primeDecompositionClient.decompose(primeDecompositionRequest)
                .forEachRemaining(primeDecompositionResponse -> {
                    System.out.println(primeDecompositionResponse.getResult());
                });
    }

    private void doClientStreamingCall(ManagedChannel channel) {
        // create an asynchronous client stub
        ComputeAverageServiceGrpc.ComputeAverageServiceStub computeAverageServiceStub = ComputeAverageServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ComputeAverageRequest> requestStreamObserver = computeAverageServiceStub.computeAverage(new StreamObserver<ComputeAverageResponse>() {
            @Override
            public void onNext(ComputeAverageResponse value) {
                // we received a response from server
                System.out.println("Average value is : " + value.getAverage());
                // onNext will be called only once
            }

            @Override
            public void onError(Throwable t) {
                // we received an error from the server
            }

            @Override
            public void onCompleted() {
                // server is done sending us data
                System.out.println("Server has completed sending us something");
                latch.countDown();
            }
        });

        System.out.println("Sending 1st number");
        requestStreamObserver.onNext(ComputeAverageRequest.newBuilder().setNumber(1).build());

        System.out.println("Sending 2nd number");
        requestStreamObserver.onNext(ComputeAverageRequest.newBuilder().setNumber(2).build());

        System.out.println("Sending 3rd number");
        requestStreamObserver.onNext(ComputeAverageRequest.newBuilder().setNumber(4).build());

        System.out.println("Sending 4th number");
        requestStreamObserver.onNext(ComputeAverageRequest.newBuilder().setNumber(3).build());

        requestStreamObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doBiDiStreamingCall(ManagedChannel channel) {
        FindMaximumServiceGrpc.FindMaximumServiceStub asyncClient = FindMaximumServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<FindMaximumRequest> requestObserver = asyncClient.findMaximum(new StreamObserver<FindMaximumResponse>() {
            @Override
            public void onNext(FindMaximumResponse value) {
                System.out.println("Response from server, Maximum till now is: " + value.getMaximum());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done with sending data");
                latch.countDown();
            }
        });

        Arrays.asList(1,5,3,6,2,20).forEach(
                num -> {
                    System.out.println("Sending: " + num);
                    requestObserver.onNext(FindMaximumRequest.newBuilder()
                            .setNumber(num)
                            .build());

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestObserver.onCompleted();

        try {
            latch.await(3,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doErrorCall(ManagedChannel channel) {
        SquareRootServiceGrpc.SquareRootServiceBlockingStub blockingStub = SquareRootServiceGrpc.newBlockingStub(channel);
        int number = -1;
        try {
            System.out.println("Going to call squareroot now: "+ number);
            blockingStub.squareRoot(SquareRootRequest.newBuilder().setNumber(number).build());
            System.out.println("Returned without Exception");
        } catch (StatusRuntimeException e){
            System.out.println("Got an exception for square root!");
            e.printStackTrace();
        }
    }
}
