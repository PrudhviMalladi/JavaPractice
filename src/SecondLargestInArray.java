import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        System.out.println("Second lagest " + scl(a,6));

    }
    public static int scl(int[] a,int total){
//        Arrays.sort(a);
//        return a[total-2];
        int temp;
        for (int i = 0; i <total ; i++) {
            for (int j = i+1; j <total ; j++) {
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        return a[total-2];
    }


}
