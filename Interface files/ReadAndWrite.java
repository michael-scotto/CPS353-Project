public interface ReadAndWrite {
    int read();
    //Reads the data from the computation
    void write(int input);
    //Writes data in the computation 
    void recallCompute();
    //recalls the computation 
}
