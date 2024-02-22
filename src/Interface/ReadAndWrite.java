package src.Interface;
public interface ReadAndWrite {
    String read();
    //Reads the data from the database
    void write(int input);
    //Writes data in the database from computation
    void recallCompute();
    //recalls the computation 
    //not sure why we need this?
}
