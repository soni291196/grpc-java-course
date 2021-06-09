package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: calculator/calculator.proto")
public final class ComputeAverageServiceGrpc {

  private ComputeAverageServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.ComputeAverageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest,
      com.proto.calculator.ComputeAverageResponse> getComputeAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "computeAverage",
      requestType = com.proto.calculator.ComputeAverageRequest.class,
      responseType = com.proto.calculator.ComputeAverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest,
      com.proto.calculator.ComputeAverageResponse> getComputeAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest, com.proto.calculator.ComputeAverageResponse> getComputeAverageMethod;
    if ((getComputeAverageMethod = ComputeAverageServiceGrpc.getComputeAverageMethod) == null) {
      synchronized (ComputeAverageServiceGrpc.class) {
        if ((getComputeAverageMethod = ComputeAverageServiceGrpc.getComputeAverageMethod) == null) {
          ComputeAverageServiceGrpc.getComputeAverageMethod = getComputeAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.ComputeAverageRequest, com.proto.calculator.ComputeAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "computeAverage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ComputeAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ComputeAverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeAverageServiceMethodDescriptorSupplier("computeAverage"))
              .build();
        }
      }
    }
    return getComputeAverageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComputeAverageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeAverageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeAverageServiceStub>() {
        @java.lang.Override
        public ComputeAverageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeAverageServiceStub(channel, callOptions);
        }
      };
    return ComputeAverageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComputeAverageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeAverageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeAverageServiceBlockingStub>() {
        @java.lang.Override
        public ComputeAverageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeAverageServiceBlockingStub(channel, callOptions);
        }
      };
    return ComputeAverageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComputeAverageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeAverageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeAverageServiceFutureStub>() {
        @java.lang.Override
        public ComputeAverageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeAverageServiceFutureStub(channel, callOptions);
        }
      };
    return ComputeAverageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ComputeAverageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageRequest> computeAverage(
        io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getComputeAverageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getComputeAverageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.calculator.ComputeAverageRequest,
                com.proto.calculator.ComputeAverageResponse>(
                  this, METHODID_COMPUTE_AVERAGE)))
          .build();
    }
  }

  /**
   */
  public static final class ComputeAverageServiceStub extends io.grpc.stub.AbstractAsyncStub<ComputeAverageServiceStub> {
    private ComputeAverageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeAverageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeAverageServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageRequest> computeAverage(
        io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getComputeAverageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ComputeAverageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ComputeAverageServiceBlockingStub> {
    private ComputeAverageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeAverageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeAverageServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ComputeAverageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ComputeAverageServiceFutureStub> {
    private ComputeAverageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeAverageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeAverageServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COMPUTE_AVERAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComputeAverageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComputeAverageServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_COMPUTE_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.computeAverage(
              (io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ComputeAverageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComputeAverageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComputeAverageService");
    }
  }

  private static final class ComputeAverageServiceFileDescriptorSupplier
      extends ComputeAverageServiceBaseDescriptorSupplier {
    ComputeAverageServiceFileDescriptorSupplier() {}
  }

  private static final class ComputeAverageServiceMethodDescriptorSupplier
      extends ComputeAverageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComputeAverageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComputeAverageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComputeAverageServiceFileDescriptorSupplier())
              .addMethod(getComputeAverageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
