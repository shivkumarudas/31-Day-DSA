
public class methodprintrectangle {

public static void rectangle(){
    int row=4;
    int column=8;
    for(int i=1;i<=row;i++){
      for(int j=1;j<=column;j++){
          System.out.print("*");
      }
      System.out.println("");
    }
}
public static void main(String[] ars){
    rectangle();
}
}
