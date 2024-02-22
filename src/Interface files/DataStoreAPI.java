public interface DataStoreAPI {
  //store the number of iterations to prove that a number is not a Lychrel. #Ideally later it should associate the iterations to the input value
  void storeIterations(int iterations);
  //gets the number of iteration from the database based on input
  int getIterations(int input);
}
