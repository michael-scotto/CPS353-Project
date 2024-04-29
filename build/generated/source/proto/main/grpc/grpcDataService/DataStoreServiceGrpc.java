package grpcDataService;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: Lychrel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataStoreServiceGrpc {

  private DataStoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpcDataService.DataStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpcDataService.Lychrel.DataStoreInput,
      grpcDataService.Lychrel.DataStoreOutput> getAppendDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "appendData",
      requestType = grpcDataService.Lychrel.DataStoreInput.class,
      responseType = grpcDataService.Lychrel.DataStoreOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcDataService.Lychrel.DataStoreInput,
      grpcDataService.Lychrel.DataStoreOutput> getAppendDataMethod() {
    io.grpc.MethodDescriptor<grpcDataService.Lychrel.DataStoreInput, grpcDataService.Lychrel.DataStoreOutput> getAppendDataMethod;
    if ((getAppendDataMethod = DataStoreServiceGrpc.getAppendDataMethod) == null) {
      synchronized (DataStoreServiceGrpc.class) {
        if ((getAppendDataMethod = DataStoreServiceGrpc.getAppendDataMethod) == null) {
          DataStoreServiceGrpc.getAppendDataMethod = getAppendDataMethod =
              io.grpc.MethodDescriptor.<grpcDataService.Lychrel.DataStoreInput, grpcDataService.Lychrel.DataStoreOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "appendData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcDataService.Lychrel.DataStoreInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcDataService.Lychrel.DataStoreOutput.getDefaultInstance()))
              .setSchemaDescriptor(new DataStoreServiceMethodDescriptorSupplier("appendData"))
              .build();
        }
      }
    }
    return getAppendDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataStoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceStub>() {
        @java.lang.Override
        public DataStoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataStoreServiceStub(channel, callOptions);
        }
      };
    return DataStoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataStoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceBlockingStub>() {
        @java.lang.Override
        public DataStoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataStoreServiceBlockingStub(channel, callOptions);
        }
      };
    return DataStoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataStoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceFutureStub>() {
        @java.lang.Override
        public DataStoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataStoreServiceFutureStub(channel, callOptions);
        }
      };
    return DataStoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void appendData(grpcDataService.Lychrel.DataStoreInput request,
        io.grpc.stub.StreamObserver<grpcDataService.Lychrel.DataStoreOutput> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataStoreService.
   */
  public static abstract class DataStoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataStoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataStoreService.
   */
  public static final class DataStoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataStoreServiceStub> {
    private DataStoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataStoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataStoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void appendData(grpcDataService.Lychrel.DataStoreInput request,
        io.grpc.stub.StreamObserver<grpcDataService.Lychrel.DataStoreOutput> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataStoreService.
   */
  public static final class DataStoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataStoreServiceBlockingStub> {
    private DataStoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataStoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpcDataService.Lychrel.DataStoreOutput appendData(grpcDataService.Lychrel.DataStoreInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataStoreService.
   */
  public static final class DataStoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataStoreServiceFutureStub> {
    private DataStoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataStoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataStoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcDataService.Lychrel.DataStoreOutput> appendData(
        grpcDataService.Lychrel.DataStoreInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPEND_DATA = 0;

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
        case METHODID_APPEND_DATA:
          serviceImpl.appendData((grpcDataService.Lychrel.DataStoreInput) request,
              (io.grpc.stub.StreamObserver<grpcDataService.Lychrel.DataStoreOutput>) responseObserver);
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
          getAppendDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpcDataService.Lychrel.DataStoreInput,
              grpcDataService.Lychrel.DataStoreOutput>(
                service, METHODID_APPEND_DATA)))
        .build();
  }

  private static abstract class DataStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataStoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpcDataService.Lychrel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataStoreService");
    }
  }

  private static final class DataStoreServiceFileDescriptorSupplier
      extends DataStoreServiceBaseDescriptorSupplier {
    DataStoreServiceFileDescriptorSupplier() {}
  }

  private static final class DataStoreServiceMethodDescriptorSupplier
      extends DataStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataStoreServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DataStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataStoreServiceFileDescriptorSupplier())
              .addMethod(getAppendDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
