package com.github.jwenjian.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcDemoApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8003)
                .addService(new HelloServiceImpl())
                .build()
                .start();
        System.out.println("gRPC server started on port 8003");
        server.awaitTermination();
    }
}
