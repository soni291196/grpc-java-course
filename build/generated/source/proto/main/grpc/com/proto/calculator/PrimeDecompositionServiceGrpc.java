package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: calculator/calculator.proto")
public final class PrimeDecompositionServiceGrpc {

  private PrimeDecompositionServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.PrimeDecompositionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.PrimeDecompositionRequest,
      com.proto.calculator.PrimeDecompositionResponse> getDecomposeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "decompose",
      requestType = com.proto.calculator.PrimeDecompositionRequest.class,
      responseType = com.proto.calculator.PrimeDecompositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.PrimeDecompositionRequest,
      com.proto.calculator.PrimeDecompositionResponse> getDecomposeMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.PrimeDecompositionRequest, com.proto.calculator.PrimeDecompositionResponse> getDecomposeMethod;
    if ((getDecomposeMethod = PrimeDecompositionServiceGrpc.getDecomposeMethod) == null) {
      synchronized (PrimeDecompositionServiceGrpc.class) {
        if ((getDecomposeMethod = PrimeDecompositionServiceGrpc.getDecomposeMethod) == null) {
          PrimeDecompositionServiceGrpc.getDecomposeMethod = getDecomposeMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.PrimeDecompositionRequest, com.proto.calculator.PrimeDecompositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "decompose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeDecompositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeDecompositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimeDecompositionServiceMethodDescriptorSupplier("decompose"))
              .build();
        }
      }
    }
    return getDecomposeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimeDecompositionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimeDecompositionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimeDecompositionServiceStub>() {
        @java.lang.Override
        public PrimeDecompositionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimeDecompositionServiceStub(channel, callOptions);
        }
      };
    return PrimeDecompositionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimeDecompositionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimeDecompositionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimeDecompositionServiceBlockingStub>() {
        @java.lang.Override
        public PrimeDecompositionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimeDecompositionServiceBlockingStub(channel, callOptions);
        }
      };
    return PrimeDecompositionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimeDecompositionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimeDecompositionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimeDecompositionServiceFutureStub>() {
        @java.lang.Override
        public PrimeDecompositionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimeDecompositionServiceFutureStub(channel, callOptions);
        }
      };
    return PrimeDecompositionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PrimeDecompositionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void decompose(com.proto.calculator.PrimeDecompositionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeDecompositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecomposeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDecomposeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.calculator.PrimeDecompositionRequest,
                com.proto.calculator.PrimeDecompositionResponse>(
                  this, METHODID_DECOMPOSE)))
          .build();
    }
  }

  /**
   */
  public static final class PrimeDecompositionServiceStub extends io.grpc.stub.AbstractAsyncStub<PrimeDecompositionServiceStub> {
    private PrimeDecompositionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompositionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimeDecompositionServiceStub(channel, callOptions);
    }

    /**
     */
    public void decompose(com.proto.calculator.PrimeDecompositionRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeDecompositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDecomposeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrimeDecompositionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrimeDecompositionServiceBlockingStub> {
    private PrimeDecompositionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompositionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimeDecompositionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.proto.calculator.PrimeDecompositionResponse> decompose(
        com.proto.calculator.PrimeDecompositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDecomposeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrimeDecompositionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrimeDecompositionServiceFutureStub> {
    private PrimeDecompositionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompositionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimeDecompositionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DECOMPOSE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimeDecompositionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimeDecompositionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECOMPOSE:
          serviceImpl.decompose((com.proto.calculator.PrimeDecompositionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.PrimeDecompositionResponse>) responseObserver);
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

  private static abstract class PrimeDecompositionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimeDecompositionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrimeDecompositionService");
    }
  }

  private static final class PrimeDecompositionServiceFileDescriptorSupplier
      extends PrimeDecompositionServiceBaseDescriptorSupplier {
    PrimeDecompositionServiceFileDescriptorSupplier() {}
  }

  private static final class PrimeDecompositionServiceMethodDescriptorSupplier
      extends PrimeDecompositionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimeDecompositionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrimeDecompositionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimeDecompositionServiceFileDescriptorSupplier())
              .addMethod(getDecomposeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
