package com.github.soni291196.grpc.calculator.server;

import com.proto.calculator.FindMaximumRequest;
import com.proto.calculator.FindMaximumResponse;
import com.proto.calculator.FindMaximumServiceGrpc;
import io.grpc.stub.StreamObserver;

public class FindMaximumServiceImpl extends FindMaximumServiceGrpc.FindMaximumServiceImplBase {
    @Override
    public StreamObserver<FindMaximumRequest> findMaximum(StreamObserver<FindMaximumResponse> responseObserver) {
        StreamObserver<FindMaximumRequest> requestObserver = new StreamObserver<FindMaximumRequest>() {
            int max = 0;
            @Override
            public void onNext(FindMaximumRequest value) {
                if (max < value.getNumber()) {
                    max = value.getNumber();
                    responseObserver.onNext(FindMaximumResponse.newBuilder().setMaximum(max).build());
                }
            }

            @Override
            public void onError(Throwable t) {
                // do nothing
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(FindMaximumResponse.newBuilder().setMaximum(max).build());
                responseObserver.onCompleted();
            }
        };
        return requestObserver;
    }
}
