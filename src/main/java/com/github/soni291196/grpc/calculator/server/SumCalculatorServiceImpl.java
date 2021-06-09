package com.github.soni291196.grpc.calculator.server;

import com.proto.calculator.CalculatorRequest;
import com.proto.calculator.CalculatorResponse;
import com.proto.calculator.Numbers;
import com.proto.calculator.SumCalculatorServiceGrpc;
import io.grpc.stub.StreamObserver;

public class SumCalculatorServiceImpl extends SumCalculatorServiceGrpc.SumCalculatorServiceImplBase {
    @Override
    public void sum(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        //extract the fields we need
        Numbers numbers = request.getNumbers();
        float firstNum = numbers.getFirstNum();
        float secondNum = numbers.getSecondNum();

        // create the response
        float result = firstNum + secondNum;
        CalculatorResponse response = CalculatorResponse.newBuilder().setResult(result).build();

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
}
