package src;

public class LychrelComputation {

    //If more than 60 we will assume it is a lychrel number
    private static int maxIterations = 60;

    //method to call other methods that do calculations
    private static boolean lychrelCheck(long num){
        for (int i=0; i<maxIterations; i++) {
            num = num + reverse(num);
            if (palindromeCheck(num)) {
                return false;
            }
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
