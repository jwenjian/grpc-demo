package com.github.jwenjian.example.grpc;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(Hello.HelloRequest request, io.grpc.stub.StreamObserver<Hello.HelloResponse> responseObserver) {
        System.out.println("hello request, name = " + request.getName());
        Hello.HelloResponse response = Hello.HelloResponse.newBuilder().setMsg("hello, " + request.getName()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
