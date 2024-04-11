package src;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LychrelComputation {
    
    private static final String DATASTORE_HOST = "localhost";
    private static final int DATASTORE_PORT = 50052;

    // Method to call the gRPC client for data store
    private static boolean sendDataToDataStore(long num) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(DATASTORE_HOST, DATASTORE_PORT)
                .usePlaintext()
                .build();

        try {
            DataStoreServiceGrpc.DataStoreServiceBlockingStub blockingStub = DataStoreServiceGrpc.newBlockingStub(channel);

            // Create request
            DataStoreInput input = DataStoreInput.newBuilder().setInputValue(num).build();

            // Call gRPC method
            DataStoreOutput response = blockingStub.appendData(input);

            // Process response
            return response.getOutputValue();
        } finally {
            channel.shutdown();
        }
    }
    
    //If more than 60 we will assume it is a lychrel number
    private static int maxIterations = 60;

    //method to call other methods that do calculations
    private static boolean lychrelCheck(long num){
        for (int i=0; i<maxIterations; i++) {
            num = num + reverse(num);
            if (palindromeCheck(num)) {
                return false;
            }
            // Send data to data store
            sendDataToDataStore(num);
        }
        return true;
    }

    //returns boolean if lychrel or not
    private static boolean palindromeCheck(final long num) {
        return num == reverse(num);
    }

    private static long reverse(long num) {
        long reverse = 0;

        while (num>0) {
            long remainder = num % 10;
            reverse = (reverse * 10) +remainder;
            num = num / 10;
        }
        return reverse;
    }

}
