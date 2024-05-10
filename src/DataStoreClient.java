import grpcDataService.DataStoreServiceGrpc;
import grpcDataService.Lychrel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class DataStoreClient {
    private final ManagedChannel channel;
    private final DataStoreServiceGrpc.DataStoreServiceBlockingStub blockingStub;

    public DataStoreClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.blockingStub = DataStoreServiceGrpc.newBlockingStub(channel);
    }

    public boolean appendData(int data) {
        Lychrel.DataStoreInput request = Lychrel.DataStoreInput.newBuilder()
                .setInputValue(data)
                .build();
        Lychrel.DataStoreOutput response = blockingStub.appendData(request);
        return response.getOutputValue();
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws Exception {
        DataStoreClient client = new DataStoreClient("localhost", 50053);

        //Test
        int data = 123; // Example data
        boolean success = client.appendData(data);
        if (success) {
            System.out.println("Data appended successfully!");
        } else {
            System.out.println("Failed to append data!");
        }

        client.shutdown();
    }
}
