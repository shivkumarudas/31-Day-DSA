//Student management system
import java.util.Scanner;

public class Miniproject1 {

    public static void menu() {

        System.out.println("\n===== STUDENT MANAGEMENT =====");
        System.out.println("1. Add Student");
        System.out.println("2. Display Student");
        System.out.println("3. Calculate Average");
        System.out.println("4. Find Highest Marks");
        System.out.println("5. Exit");
        System.out.print("Enter Choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            menu();

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Add Student");
                    System.out.println("Enter your full name");
                    String name= sc.nextLine();
                    break;

                case 2:
                    System.out.println("Display Student");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Average");
                    break;

                case 4:
                    System.out.println("Highest");
                    break;

                case 5:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}