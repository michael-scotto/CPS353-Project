import grpcDataService.Lychrel;
import io.grpc.stub.StreamObserver;

public class DataStoreServiceImpl extends grpcDataService.DataStoreServiceGrpc.DataStoreServiceImplBase{
    public void appendData(Lychrel.DataStoreInput request, StreamObserver<Lychrel.DataStoreOutput> responseObserver) {
        super.appendData(request, responseObserver);
    }
}

