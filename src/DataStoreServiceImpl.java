import grpcDataService.Lychrel;
import io.grpc.stub.StreamObserver;

public class DataStoreServiceImpl extends grpcDataService.DataStoreServiceGrpc.DataStoreServiceImplBase{
    public void appendData(Lychrel.DataStoreInput request, StreamObserver<Lychrel.DataStoreOutput> responseObserver) {
        Lychrel.DataStoreOutput response = Lychrel.DataStoreOutput.newBuilder().setOutputValue(LychrelComputation.lychrelCheck(request.getInputValue())).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

