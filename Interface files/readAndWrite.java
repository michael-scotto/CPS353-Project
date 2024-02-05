public interface ReadAndWrite {
    void CInitialize();
    //Initializes the data for the computation
    int CRead();
    //Reads the data from the computation
    void CWrite(int input);
    //Writes data in the computation 
    void RecallCompute();
    //recalls the computation 
}
