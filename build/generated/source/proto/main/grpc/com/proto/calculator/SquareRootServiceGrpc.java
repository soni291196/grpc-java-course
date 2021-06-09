package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: calculator/calculator.proto")
public final class SquareRootServiceGrpc {

  private SquareRootServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.SquareRootService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.SquareRootRequest,
      com.proto.calculator.SquareRootResponse> getSquareRootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "squareRoot",
      requestType = com.proto.calculator.SquareRootRequest.class,
      responseType = com.proto.calculator.SquareRootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.SquareRootRequest,
      com.proto.calculator.SquareRootResponse> getSquareRootMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.SquareRootRequest, com.proto.calculator.SquareRootResponse> getSquareRootMethod;
    if ((getSquareRootMethod = SquareRootServiceGrpc.getSquareRootMethod) == null) {
      synchronized (SquareRootServiceGrpc.class) {
        if ((getSquareRootMethod = SquareRootServiceGrpc.getSquareRootMethod) == null) {
          SquareRootServiceGrpc.getSquareRootMethod = getSquareRootMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.SquareRootRequest, com.proto.calculator.SquareRootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "squareRoot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SquareRootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SquareRootResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SquareRootServiceMethodDescriptorSupplier("squareRoot"))
              .build();
        }
      }
    }
    return getSquareRootMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SquareRootServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SquareRootServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SquareRootServiceStub>() {
        @java.lang.Override
        public SquareRootServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SquareRootServiceStub(channel, callOptions);
        }
      };
    return SquareRootServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SquareRootServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SquareRootServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SquareRootServiceBlockingStub>() {
        @java.lang.Override
        public SquareRootServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SquareRootServiceBlockingStub(channel, callOptions);
        }
      };
    return SquareRootServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SquareRootServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SquareRootServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SquareRootServiceFutureStub>() {
        @java.lang.Override
        public SquareRootServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SquareRootServiceFutureStub(channel, callOptions);
        }
      };
    return SquareRootServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SquareRootServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *error handling
     * this RPC will throw an exception if the sent number is negative
     * </pre>
     */
    public void squareRoot(com.proto.calculator.SquareRootRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SquareRootResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSquareRootMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSquareRootMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.SquareRootRequest,
                com.proto.calculator.SquareRootResponse>(
                  this, METHODID_SQUARE_ROOT)))
          .build();
    }
  }

  /**
   */
  public static final class SquareRootServiceStub extends io.grpc.stub.AbstractAsyncStub<SquareRootServiceStub> {
    private SquareRootServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareRootServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SquareRootServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *error handling
     * this RPC will throw an exception if the sent number is negative
     * </pre>
     */
    public void squareRoot(com.proto.calculator.SquareRootRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SquareRootResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSquareRootMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SquareRootServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SquareRootServiceBlockingStub> {
    private SquareRootServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareRootServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SquareRootServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *error handling
     * this RPC will throw an exception if the sent number is negative
     * </pre>
     */
    public com.proto.calculator.SquareRootResponse squareRoot(com.proto.calculator.SquareRootRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSquareRootMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SquareRootServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SquareRootServiceFutureStub> {
    private SquareRootServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareRootServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SquareRootServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *error handling
     * this RPC will throw an exception if the sent number is negative
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.SquareRootResponse> squareRoot(
        com.proto.calculator.SquareRootRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSquareRootMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SQUARE_ROOT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SquareRootServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SquareRootServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SQUARE_ROOT:
          serviceImpl.squareRoot((com.proto.calculator.SquareRootRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.SquareRootResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SquareRootServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SquareRootServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SquareRootService");
    }
  }

  private static final class SquareRootServiceFileDescriptorSupplier
      extends SquareRootServiceBaseDescriptorSupplier {
    SquareRootServiceFileDescriptorSupplier() {}
  }

  private static final class SquareRootServiceMethodDescriptorSupplier
      extends SquareRootServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SquareRootServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SquareRootServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SquareRootServiceFileDescriptorSupplier())
              .addMethod(getSquareRootMethod())
              .build();
        }
      }
    }
    return result;
  }
}
