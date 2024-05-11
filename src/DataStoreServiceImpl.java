import grpcDataService.Lychrel;
import interfaces.DataStore;
import io.grpc.stub.StreamObserver;

public class DataStoreServiceImpl extends grpcDataService.DataStoreServiceGrpc.DataStoreServiceImplBase{
    public void appendData(Lychrel.DataStoreInput request, StreamObserver<Lychrel.DataStoreOutput> responseObserver) {
        //Lychrel.DataStoreOutput response = Lychrel.DataStoreOutput.newBuilder().setOutputValue(LychrelComputation.sendDataToDataStore(request.getInputValue())).build();
        Lychrel.DataStoreOutput response;
        try {
            long num = request.getInputValue();
            //dummy line
            response = Lychrel.DataStoreOutput.newBuilder().setOutputValue(LychrelComputation.sendToDatabase((int) num)).build();
        } catch (Exception e){
            response = Lychrel.DataStoreOutput.newBuilder().setOutputValue(false).build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

