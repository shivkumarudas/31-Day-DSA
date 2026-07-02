import java.util.Scanner;
public class smallprogifelse {
 public static void main(String[] args){
    String username="admin";
    int pass=1234;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your username");
    String user=sc.nextLine();
    System.out.println("Enter your password");
    int pass1=sc.nextInt();
if(user.equals(username) && pass1==pass){
    
    System.out.println("Welcome to the system");
}
 else{
    System.out.println("Invalid username or password");
}

 }   
}
