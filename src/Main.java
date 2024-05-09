import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number or file: ");
        int num = sc.nextInt();
        LychrelComputation.lychrelCheck(num);
        System.out.println(num); //debug line
        //let it take in a number or a string (string is filename)
    }
}
