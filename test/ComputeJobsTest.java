package test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ComputeJobsTest {
    @Test
    public boolean testLychrel(int num) {
        Mockito number = Mockito.mock(Mockito.class);
        //reverse num
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            int remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            temp = temp / 10;
        }
        //check if pali
        if (reverse == num) {
            return true;
        } else {
            //add reveresed to num
            num += reverse;
            return testLychrel(num);
        }
    }
}
