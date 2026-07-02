public class reversenum {
    public static void main(String[] args){
        int n=12345;
        int rev=0;
        for(int i=n;i>0;i=i/10){
            int rem=i%10;
            rev=rev*10+rem;
        }
        System.out.println("The reverse of the given number is "+rev);
    }
}
