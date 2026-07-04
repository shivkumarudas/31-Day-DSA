public class secondlargest{
    public static void main(String[] args){

        int[] arr={25,66,89,65,33,64};
        int max=arr[0];
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
        System.out.println(max);
    }
}