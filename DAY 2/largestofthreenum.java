package DAY 2;

public class largestofthreenum {
    public static void main(String[] args){
        int a=11;
        int b=22;
        int c=5;
        if(a>b && a>c){
            System.out.println(a +" is the largest number");
        }
        if(b>a && b>c){
            System.out.println(b +" is the largest number");
        }
        else{
            System.out.println(c +" is the largest number");
        }
    }
    
}
