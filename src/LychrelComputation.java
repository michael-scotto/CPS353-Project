import grpcDataService.DataStoreServiceGrpc;
import grpcDataService.Lychrel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LychrelComputation {
    
    private static final String DATASTORE_HOST = "localhost";
    private static final int DATASTORE_PORT = 50053;

    //Database for storing the results. Width is that of every integer.
    //The row has the number, the second row has if it's a palindrome (1 for yes, -1 for no).
    static long[][] database = new long[100000][2];

    // Method to call the gRPC client for data store
    static boolean sendDataToDataStore(long num) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(DATASTORE_HOST, DATASTORE_PORT)
                .usePlaintext()
                .build();

        try {
            DataStoreServiceGrpc.DataStoreServiceBlockingStub blockingStub = DataStoreServiceGrpc.newBlockingStub(channel);

            // Create request
            Lychrel.DataStoreInput input = Lychrel.DataStoreInput.newBuilder().setInputValue((int) num).build();

            //Call this method again because in DataStoreServiceImpl it doesn't properly write to the database, only checks validity.
            sendToDatabase((int) num);

            // Call gRPC method
            Lychrel.DataStoreOutput response = blockingStub.appendData(input);

            // Process response
            return response.getOutputValue();

        } finally {
            channel.shutdown();
        }
    }

    static boolean sendToDatabase(int num){
        for (int i=0;i<database.length-1;i++){
            if (database[i][0]==num){
                database[i][1]= -1;
                return true;
            }
            else if (database[i][1]==0){
                database[i][0]=num;
                database[i][1]= -1;
                return true;
            }
            }
        return false;
        }


    //If more than 60 we will assume it is a lychrel number
    private static int maxIterations = 60;

    //method to call other methods that do calculations
    public static boolean lychrelCheck(long num) {
        for (int i = 0; i < maxIterations; i++) {
            num = num + reverse(num);
            //checks if the number is in the database.
            for (int j = 0; j < database.length - 1; j++) {
                if (database[j][0] == num) {
                    if (database[j][1] == 0) { //checks for if whatever's saved there has no saved palindrome value
                        if (palindromeCheck(num)) {
                            database[j][1] = 1;
                            return false;
                        } else {
                            System.out.println(i + 1 + " " + num); //debug line
                            // Send data to data store
                            sendDataToDataStore(num);
                        }
                    } else if (database[j][1] == 1) {
                        System.out.println("Already in database");
                        return false;
                    } else {
                        System.out.println("Already in database");
                    }

                }
            }
            if (palindromeCheck(num)) {
                //If it's a palindrome, adds to database without the DataStoreService
                for (int j = 0; j < database.length - 1; j++) {
                    if (database[j][1] == 0){ //checks for if whatever's saved there has no saved palindrome value
                        database[j][0] = num;
                        database[j][1] = 1;
                        return false;
                    }
                }
                System.out.println("Database full!");
                return false;
            }
            System.out.println(i+1 + " " + num); //debug line
            // Send data to data store
            //when computation goes over 2 iterations and reaches this line. it fails, but works when line is not there
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
