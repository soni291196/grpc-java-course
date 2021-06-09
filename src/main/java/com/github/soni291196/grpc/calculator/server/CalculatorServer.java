package com.github.soni291196.grpc.calculator.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello gRPC");

        Server server = ServerBuilder.forPort(50052)
                .addService(new SumCalculatorServiceImpl())
                .addService(new PrimeDecompositionServiceImpl())
                .addService(new ComputeAverageServiceImpl())
                .addService(new FindMaximumServiceImpl())
                .addService(new SquareRootServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
