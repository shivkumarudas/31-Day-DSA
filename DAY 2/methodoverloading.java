public class methodoverloading {
    public static void print(){
        System.out.println("hello");
    }
    public static void print(String name){
        System.out.println("hello "+name);
    }
    public static void main(String[] args){
        print();
        print("shiv");
    }
}
