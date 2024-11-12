import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[]  num){
        int n=num.length;

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
           temp[i]= num[n-i-1];
        }
        for (int i = 0; i <n ; i++) {
                num[i]=temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
