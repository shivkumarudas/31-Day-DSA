import java.util.Scanner;
public class calculatorusingswitch {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    System.out.println("choose the option from the following:");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");     
    System.out.println("4.Division");
    int option=sc.nextInt();
    switch(option){
        case 1:
            System.out.println("The sum of the two numbers is "+(a+b));
            break;  
        case 2:
            System.out.println("The difference of the two numbers is "+(a-b));
            break;  
        case 3:
            System.out.println("The product of the two numbers is "+(a*b)); 
            break;  
        case 4:
            System.out.println("The quotient of the two numbers is "+(a/b));
            break;
        default:
            System.out.println("Invalid option");
            break;  
    }

}    
}
