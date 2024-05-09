import java.util.concurrent.TimeUnit;

import grpcDataService.LychrelComputatioSnerviceGrpc;
import grpcDataService.Lychrel;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.ManagedChannelBuilder;

public class LychrelComputationClient {
    private final ManagedChannel channel;
    private final LychrelComputatioSnerviceGrpc.LychrelComputatioSnerviceBlockingStub blockingStub;

    public LychrelComputationClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.blockingStub = LychrelComputatioSnerviceGrpc.newBlockingStub(channel);
    }

    public boolean checkLychrelNumber(long number) {
        Lychrel.LychrelRequest request = Lychrel.LychrelRequest.newBuilder().setNumber(number).build();
        Lychrel.LychrelResponse response = blockingStub.checkLychrelNumber(request);
        return response.getIsLychrel();
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws Exception {
        LychrelComputationClient client = new LychrelComputationClient("localhost", 50052);

        //Test
        long numberToCheck = 123456789;
        boolean isLychrel = client.checkLychrelNumber(numberToCheck);
        System.out.println("Is Lychrel: " + isLychrel);


        client.shutdown();
    }
}
