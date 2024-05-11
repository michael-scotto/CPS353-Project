import grpcDataService.Lychrel;

public class LychrelComputationServiceImpl extends grpcDataService.LychrelComputationServiceGrpc.LychrelComputationServiceImplBase{
    public void checkLychrelNumber(grpcDataService.Lychrel.LychrelRequest request,
       io.grpc.stub.StreamObserver<grpcDataService.Lychrel.LychrelResponse> responseObserver) {
        Lychrel.LychrelResponse response = Lychrel.LychrelResponse.newBuilder().setIsLychrel(LychrelComputation.lychrelCheck(request.getNumber())).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
