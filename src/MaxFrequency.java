import java.util.Arrays;

public class MaxFrequency {
    public static void main(String[] args) {
       int[] nums ={1,2,2,3,1,4};
        maxFrequencyElements(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int maxFrequencyElements(int[] nums) {
         int max=0;
        for (int i = 0; i < nums.length; i++) {
            if (max <=nums[i])
                max=nums[i];

        }
        int arr[] = new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            int ans =nums[i];
            arr[ans]++;
            
        }
        int maxVal=0,ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (maxVal<=arr[i])
                maxVal=arr[i];
        }
        for(int i=0; i<arr.length; i++){
            if(maxVal == arr[i]) ans+=arr[i];
        }
        return ans;
    }
}
