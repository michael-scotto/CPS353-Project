public class DataStoreImpl implements ReadAndWrite, DataStore {
  
  @Override
  String read();
  
  @Override
  void write(int input);
  
  @Override
  void recallCompute();
  
  @Override
  void storeIterations(int iterations);
  
  @Override
  int getIterations(int input);

}
