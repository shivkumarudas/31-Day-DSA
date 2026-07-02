public class factinmethod {
 public static void fact(int a){
    int fact=1;
    int i=1;
    while(i<=a){
        fact=fact*i;
        i++;
    }
    System.out.println("The factorial of "+a+" is "+fact);
 }
 public static void main(String[] args){
    fact(4);
    fact(5);
 }
}
