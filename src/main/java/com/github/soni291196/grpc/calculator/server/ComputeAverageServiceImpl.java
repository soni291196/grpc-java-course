package com.github.soni291196.grpc.calculator.server;

import com.proto.calculator.ComputeAverageRequest;
import com.proto.calculator.ComputeAverageResponse;
import com.proto.calculator.ComputeAverageServiceGrpc;
import io.grpc.stub.StreamObserver;

public class ComputeAverageServiceImpl extends ComputeAverageServiceGrpc.ComputeAverageServiceImplBase {
    @Override
    public StreamObserver<ComputeAverageRequest> computeAverage(StreamObserver<ComputeAverageResponse> responseObserver) {
        StreamObserver<ComputeAverageRequest> requestStreamObserver = new StreamObserver<ComputeAverageRequest>() {
            double sum = 0.0;
            int count = 0;

            @Override
            public void onNext(ComputeAverageRequest value) {
                // we received a message from the client
                sum += value.getNumber();
                count += 1;
            }

            @Override
            public void onError(Throwable t) {
                // we received an error from the client
            }

            @Override
            public void onCompleted() {
                // client is done sending messages
                double average = sum /(count * 1.0);
                responseObserver.onNext(ComputeAverageResponse.newBuilder().setAverage(average).build());

                responseObserver.onCompleted();
            }
        };

        return requestStreamObserver;
    }
}
