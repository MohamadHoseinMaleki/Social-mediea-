import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        ArrayList<Account> accounts = new ArrayList<>();

        // Graph graph = new Graph;


        while (true) {
            System.out.println("\tEnter number of your choice ??\n1_  login User\n2_ show profile\n3_ show list of user\n4_ Search user" + "\n5_ suggestion ");
            int manueinput = scan.nextInt();
            scan.nextLine();//scan.nextLine();

            if (manueinput == 1) {
                boolean loop1 = true;
                int menueinput2 = scan.nextInt();
                System.out.println("\tEnter your number ?  7_ Exit");

                if (menueinput2 == 1) {

                }

                if (menueinput2 == 7) {

                    loop1 = false;
                }

            }
            if (manueinput == 2) {
                boolean loop2 = true;
                int menuinpu3 = scan.nextInt();
                if (menuinpu3 == 8)
                    loop2 = false;

            }
            if (manueinput == 3) {
                int menuinp4 = scan.nextInt();
                boolean loop3 = true;

                if (menuinp4 == 3)
                    loop3 = false;

            }
            if (manueinput == 4) {
                boolean loop4 = true;
                int munuinp5 = scan.nextInt();
                if (munuinp5 == 7) {

                    loop4 = false;
                }

            }
            if (manueinput == 5) {
                Boolean loop5 = true;
                int menuinp5 = scan.nextInt();
                if (menuinp5 == 3) {

                    loop5 = false;
                }
            }
            if (manueinput == 6) {
                boolean loop6 = true;
                int menuinp6 = scan.nextInt();
                if (menuinp6 == 3) loop6 = false;

            }
        }
    }
}
