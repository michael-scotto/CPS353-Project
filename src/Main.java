import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Are you inputting a positive number [0] or a filename [1]? Then, followed by a space, put the number or the filename you want to be used.\nInput '0' or '1', followed by a positive number or filename (filename not implimented):");
            int b = sc.nextInt();
            if (b == 0) {
                int num = sc.nextInt();
                System.out.println(LychrelComputation.lychrelCheck(num));
                System.out.println(num); //debug line
            } else if (b == 1) {
                //THIS DOES NOT WORK YET
                String name = sc.nextLine();
                File file = new File(name);
                try {
                    sc = new Scanner(file);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                while (sc.hasNextInt()) {
                    int num = sc.nextInt();
                    //LychrelComputation.lychrelCheck(num);
                    System.out.println(num); //debug line
                }
            } else {
                System.out.println("Invalid input, you have to put 0 or 1.");
            }
        }
    }
}
