public interface ReadAndWrite {
    void cInitialize();
    //Initializes the data for the computation
    int cRead();
    //Reads the data from the computation
    void cWrite(int input);
    //Writes data in the computation 
    void recallCompute();
    //recalls the computation 
}
