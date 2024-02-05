public interface DataProcessingAPI {
    void setInput(int input);
    //between input and result
    String inputDelimeter(String delim1);
    //between output and result
    String outputDelimeter(String delim2);
    void executeJob();
}
