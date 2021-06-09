package com.github.soni291196.grpc.calculator.server;

import com.proto.calculator.SquareRootRequest;
import com.proto.calculator.SquareRootResponse;
import com.proto.calculator.SquareRootServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class SquareRootServiceImpl extends SquareRootServiceGrpc.SquareRootServiceImplBase {
    @Override
    public void squareRoot(SquareRootRequest request, StreamObserver<SquareRootResponse> responseObserver) {
        int number = request.getNumber();

        System.out.println("Number received is: "+ number);
        if(number >= 0) {
            double numberRoot = Math.sqrt(number);
            responseObserver.onNext(SquareRootResponse.newBuilder().setNumberRoot(numberRoot).build());
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(
                    Status.INVALID_ARGUMENT
                    .withDescription("The number being sent is not positive").augmentDescription("Number sent: " + number)
                    .asRuntimeException()
            );
        }
    }
}
