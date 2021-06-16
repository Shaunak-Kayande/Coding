/**
 * This problem is done by Kadane’s algorithm:
 * look for all positive contiguous segments of the array (sum is used for this).
 * And keep track of maximum sum contiguous segment among all positive segments (maxsum is   
 * used for this). Each time we get a positive-sum compare it with maxsum and update 
 * maxsum if it is greater than maxsum.
 */

public class SubarraySum {

    public static int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum > maxsum) maxsum = sum;
            if(sum < 0) sum = 0;
        }
        return maxsum;
        
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,-2,5,7,-9,8,4,-5,-4};
        int ans = maxSubarraySum(arr, arr.length);
        System.out.println("Maximum Subarray Sum is:\n " + ans);
        
    }
}
