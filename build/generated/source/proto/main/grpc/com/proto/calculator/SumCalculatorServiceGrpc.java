package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: calculator/calculator.proto")
public final class SumCalculatorServiceGrpc {

  private SumCalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.SumCalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest,
      com.proto.calculator.CalculatorResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sum",
      requestType = com.proto.calculator.CalculatorRequest.class,
      responseType = com.proto.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest,
      com.proto.calculator.CalculatorResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest, com.proto.calculator.CalculatorResponse> getSumMethod;
    if ((getSumMethod = SumCalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (SumCalculatorServiceGrpc.class) {
        if ((getSumMethod = SumCalculatorServiceGrpc.getSumMethod) == null) {
          SumCalculatorServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.CalculatorRequest, com.proto.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumCalculatorServiceMethodDescriptorSupplier("sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SumCalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumCalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumCalculatorServiceStub>() {
        @java.lang.Override
        public SumCalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumCalculatorServiceStub(channel, callOptions);
        }
      };
    return SumCalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SumCalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumCalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumCalculatorServiceBlockingStub>() {
        @java.lang.Override
        public SumCalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumCalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return SumCalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SumCalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumCalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumCalculatorServiceFutureStub>() {
        @java.lang.Override
        public SumCalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumCalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return SumCalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SumCalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.proto.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.CalculatorRequest,
                com.proto.calculator.CalculatorResponse>(
                  this, METHODID_SUM)))
          .build();
    }
  }

  /**
   */
  public static final class SumCalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<SumCalculatorServiceStub> {
    private SumCalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumCalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumCalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.proto.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SumCalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SumCalculatorServiceBlockingStub> {
    private SumCalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumCalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumCalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculator.CalculatorResponse sum(com.proto.calculator.CalculatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SumCalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SumCalculatorServiceFutureStub> {
    private SumCalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumCalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumCalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.CalculatorResponse> sum(
        com.proto.calculator.CalculatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SumCalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SumCalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.calculator.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse>) responseObserver);
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

  private static abstract class SumCalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SumCalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SumCalculatorService");
    }
  }

  private static final class SumCalculatorServiceFileDescriptorSupplier
      extends SumCalculatorServiceBaseDescriptorSupplier {
    SumCalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class SumCalculatorServiceMethodDescriptorSupplier
      extends SumCalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SumCalculatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SumCalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SumCalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
