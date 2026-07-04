public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {25, 10, 40, 15, 35};

        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}