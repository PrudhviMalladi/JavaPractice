import java.util.Arrays;

public class ArraysAD {

    public static void main(String[] args) {
     int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i <n/2 ; i++) {
            System.out.print(arr[i]+ " ");
        }
        for (int i = n-1; i >=n/2 ; i--) {
            System.out.print(arr[i]+ " ");
        }

    }
}