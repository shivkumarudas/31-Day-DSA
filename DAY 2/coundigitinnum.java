public class coundigitinnum {
public static void main(String[] args){
    int n=12345;
    int count=0;
    while(n>0){
        n=n/10;
        count++;
    }
    System.out.println("The number of digits in the given number is "+count);
}    
}
