package grpcDataService;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: Lychrel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LychrelComputationServiceGrpc {

  private LychrelComputationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpcDataService.LychrelComputationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpcDataService.Lychrel.LychrelRequest,
      grpcDataService.Lychrel.LychrelResponse> getCheckLychrelNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckLychrelNumber",
      requestType = grpcDataService.Lychrel.LychrelRequest.class,
      responseType = grpcDataService.Lychrel.LychrelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcDataService.Lychrel.LychrelRequest,
      grpcDataService.Lychrel.LychrelResponse> getCheckLychrelNumberMethod() {
    io.grpc.MethodDescriptor<grpcDataService.Lychrel.LychrelRequest, grpcDataService.Lychrel.LychrelResponse> getCheckLychrelNumberMethod;
    if ((getCheckLychrelNumberMethod = LychrelComputationServiceGrpc.getCheckLychrelNumberMethod) == null) {
      synchronized (LychrelComputationServiceGrpc.class) {
        if ((getCheckLychrelNumberMethod = LychrelComputationServiceGrpc.getCheckLychrelNumberMethod) == null) {
          LychrelComputationServiceGrpc.getCheckLychrelNumberMethod = getCheckLychrelNumberMethod =
              io.grpc.MethodDescriptor.<grpcDataService.Lychrel.LychrelRequest, grpcDataService.Lychrel.LychrelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckLychrelNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcDataService.Lychrel.LychrelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcDataService.Lychrel.LychrelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LychrelComputationServiceMethodDescriptorSupplier("CheckLychrelNumber"))
              .build();
        }
      }
    }
    return getCheckLychrelNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LychrelComputationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LychrelComputationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LychrelComputationServiceStub>() {
        @java.lang.Override
        public LychrelComputationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LychrelComputationServiceStub(channel, callOptions);
        }
      };
    return LychrelComputationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LychrelComputationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LychrelComputationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LychrelComputationServiceBlockingStub>() {
        @java.lang.Override
        public LychrelComputationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LychrelComputationServiceBlockingStub(channel, callOptions);
        }
      };
    return LychrelComputationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LychrelComputationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LychrelComputationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LychrelComputationServiceFutureStub>() {
        @java.lang.Override
        public LychrelComputationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LychrelComputationServiceFutureStub(channel, callOptions);
        }
      };
    return LychrelComputationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void checkLychrelNumber(grpcDataService.Lychrel.LychrelRequest request,
        io.grpc.stub.StreamObserver<grpcDataService.Lychrel.LychrelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckLychrelNumberMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LychrelComputationService.
   */
  public static abstract class LychrelComputationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LychrelComputationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LychrelComputationService.
   */
  public static final class LychrelComputationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LychrelComputationServiceStub> {
    private LychrelComputationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LychrelComputationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LychrelComputationServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkLychrelNumber(grpcDataService.Lychrel.LychrelRequest request,
        io.grpc.stub.StreamObserver<grpcDataService.Lychrel.LychrelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckLychrelNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LychrelComputationService.
   */
  public static final class LychrelComputationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LychrelComputationServiceBlockingStub> {
    private LychrelComputationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LychrelComputationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LychrelComputationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpcDataService.Lychrel.LychrelResponse checkLychrelNumber(grpcDataService.Lychrel.LychrelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckLychrelNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LychrelComputationService.
   */
  public static final class LychrelComputationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LychrelComputationServiceFutureStub> {
    private LychrelComputationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LychrelComputationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LychrelComputationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcDataService.Lychrel.LychrelResponse> checkLychrelNumber(
        grpcDataService.Lychrel.LychrelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckLychrelNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_LYCHREL_NUMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_LYCHREL_NUMBER:
          serviceImpl.checkLychrelNumber((grpcDataService.Lychrel.LychrelRequest) request,
              (io.grpc.stub.StreamObserver<grpcDataService.Lychrel.LychrelResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCheckLychrelNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpcDataService.Lychrel.LychrelRequest,
              grpcDataService.Lychrel.LychrelResponse>(
                service, METHODID_CHECK_LYCHREL_NUMBER)))
        .build();
  }

  private static abstract class LychrelComputationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LychrelComputationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpcDataService.Lychrel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LychrelComputationService");
    }
  }

  private static final class LychrelComputationServiceFileDescriptorSupplier
      extends LychrelComputationServiceBaseDescriptorSupplier {
    LychrelComputationServiceFileDescriptorSupplier() {}
  }

  private static final class LychrelComputationServiceMethodDescriptorSupplier
      extends LychrelComputationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LychrelComputationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LychrelComputationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LychrelComputationServiceFileDescriptorSupplier())
              .addMethod(getCheckLychrelNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
