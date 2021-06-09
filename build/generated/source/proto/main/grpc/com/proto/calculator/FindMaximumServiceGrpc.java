package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: calculator/calculator.proto")
public final class FindMaximumServiceGrpc {

  private FindMaximumServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.FindMaximumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.FindMaximumRequest,
      com.proto.calculator.FindMaximumResponse> getFindMaximumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findMaximum",
      requestType = com.proto.calculator.FindMaximumRequest.class,
      responseType = com.proto.calculator.FindMaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.FindMaximumRequest,
      com.proto.calculator.FindMaximumResponse> getFindMaximumMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.FindMaximumRequest, com.proto.calculator.FindMaximumResponse> getFindMaximumMethod;
    if ((getFindMaximumMethod = FindMaximumServiceGrpc.getFindMaximumMethod) == null) {
      synchronized (FindMaximumServiceGrpc.class) {
        if ((getFindMaximumMethod = FindMaximumServiceGrpc.getFindMaximumMethod) == null) {
          FindMaximumServiceGrpc.getFindMaximumMethod = getFindMaximumMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.FindMaximumRequest, com.proto.calculator.FindMaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findMaximum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.FindMaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.FindMaximumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FindMaximumServiceMethodDescriptorSupplier("findMaximum"))
              .build();
        }
      }
    }
    return getFindMaximumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FindMaximumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindMaximumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindMaximumServiceStub>() {
        @java.lang.Override
        public FindMaximumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindMaximumServiceStub(channel, callOptions);
        }
      };
    return FindMaximumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FindMaximumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindMaximumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindMaximumServiceBlockingStub>() {
        @java.lang.Override
        public FindMaximumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindMaximumServiceBlockingStub(channel, callOptions);
        }
      };
    return FindMaximumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FindMaximumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindMaximumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindMaximumServiceFutureStub>() {
        @java.lang.Override
        public FindMaximumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindMaximumServiceFutureStub(channel, callOptions);
        }
      };
    return FindMaximumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FindMaximumServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFindMaximumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindMaximumMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.calculator.FindMaximumRequest,
                com.proto.calculator.FindMaximumResponse>(
                  this, METHODID_FIND_MAXIMUM)))
          .build();
    }
  }

  /**
   */
  public static final class FindMaximumServiceStub extends io.grpc.stub.AbstractAsyncStub<FindMaximumServiceStub> {
    private FindMaximumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindMaximumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindMaximumServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFindMaximumMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class FindMaximumServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FindMaximumServiceBlockingStub> {
    private FindMaximumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindMaximumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindMaximumServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class FindMaximumServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FindMaximumServiceFutureStub> {
    private FindMaximumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindMaximumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindMaximumServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FIND_MAXIMUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FindMaximumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FindMaximumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_MAXIMUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaximum(
              (io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FindMaximumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FindMaximumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FindMaximumService");
    }
  }

  private static final class FindMaximumServiceFileDescriptorSupplier
      extends FindMaximumServiceBaseDescriptorSupplier {
    FindMaximumServiceFileDescriptorSupplier() {}
  }

  private static final class FindMaximumServiceMethodDescriptorSupplier
      extends FindMaximumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FindMaximumServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FindMaximumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FindMaximumServiceFileDescriptorSupplier())
              .addMethod(getFindMaximumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
