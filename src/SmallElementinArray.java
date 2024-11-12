public class SmallElementinArray {
    public static void main(String[] args) {
  int[] arr = new int[] {2,10,6,1,5};
      int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> min)
                 min=arr[i];


            
        }
        System.out.println("Smallest number in given array"  + min);
    }

}
