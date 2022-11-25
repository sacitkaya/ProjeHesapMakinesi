import java.util.Scanner;

import static Islemler.Islemlistesi.*;

public class Main {
    public static void main(String[] args) {

        char quit = 'n';
        String input;
        int choice = 0;

        Scanner scan = new Scanner(System.in);
        while (quit != 'y') {

            System.out.println("******************************* **********");
            System.out.println("****** WELCOME TO MY CALCULATOR **********");
            System.out.println("******************************************");
            System.out.println("1. ADD          5. SIN        9. MATHPOWER");
            System.out.println("2. SUBTRACT     6. COS       10. PERCENTAGE");
            System.out.println("3. MULTIPLY     7. TAN       11. MOD");
            System.out.println("4. DIVIDE       8. SQRT      12. ÇIKIŞ");

            System.out.print("Please Choose a Function: ");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
               case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    sin();
                    break;
                case 6:
                    cos();
                    break;
                case 7:
                    tan();
                    break;
                case 8:
                    sqrt();
                case 9:
                    mathpower();
                    break;
                case 10:
                    percentage();
                    break;
                case 11:
                    mod();
                    break;
                default:
                    System.out.println("That wasn't a CHOICE ");
            }
            System.out.println("Would you like to QUIT y/n ?");
            input = scan.next().toLowerCase();
            quit = input.charAt(0);
        }
    }
}








