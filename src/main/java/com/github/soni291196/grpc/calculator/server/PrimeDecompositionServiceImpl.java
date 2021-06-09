package com.github.soni291196.grpc.calculator.server;

import com.proto.calculator.PrimeDecompositionRequest;
import com.proto.calculator.PrimeDecompositionResponse;
import com.proto.calculator.PrimeDecompositionServiceGrpc;
import io.grpc.stub.StreamObserver;

public class PrimeDecompositionServiceImpl extends PrimeDecompositionServiceGrpc.PrimeDecompositionServiceImplBase {
    @Override
    public void decompose(PrimeDecompositionRequest request, StreamObserver<PrimeDecompositionResponse> responseObserver) {
        int num = request.getNumber();
        int k = 2;
        try {
            while(num > 1) {
                if (num % k == 0) {
                    int result = k;
                    num = num / k;
                    PrimeDecompositionResponse response = PrimeDecompositionResponse.newBuilder()
                            .setResult(result)
                            .build();
                    responseObserver.onNext(response);
                    Thread.sleep(1000L);
                } else {
                    k = k + 1;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }
}
