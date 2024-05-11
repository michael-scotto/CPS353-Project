import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input postive integer (maximum 2147483647), or -1 to view database:\n(Multiple inputs seperated by spaces are allowed, but will cause this message to repeat)");
            if (sc.hasNextInt()){
                int num = sc.nextInt();
                if (num>0) {
                    System.out.println(LychrelComputation.lychrelCheck(num));
                } else if (num== -1) {
                    for (int i = 0; i < LychrelComputation.database.length - 1; i++) {
                        if (LychrelComputation.database[i][0] != 0) {
                            System.out.println(LychrelComputation.database[i][0] + " " + LychrelComputation.database[i][1]);
                        }
                    }
                } else {
                    System.out.println("Not a valid input, must be a positive integer or -1");
                }
            } else {
                System.out.println("Must be an integer below 2147483647! or -1");
                sc.next();
            }

            //System.out.println(num); //debug line
            /*} else if (b == 1) {
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
            } */
        }
    }
}
