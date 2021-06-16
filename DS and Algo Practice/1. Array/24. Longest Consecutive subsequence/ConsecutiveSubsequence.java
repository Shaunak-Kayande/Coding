import java.util.*;
public class ConsecutiveSubsequence {
    static int findLongestConseqSubseq(int arr[], int n)
	{
	    Arrays.sort(arr);
 
        int ans = 1, count = 1;
       
        for (int i = 1; i < n; i++)
        {
            if (arr[i] - arr[i - 1] == 1) count++;
            else if(arr[i] - arr[i - 1] > 1) count=1;
            if(count > ans) ans = count;
        }
        return ans;
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int ans = findLongestConseqSubseq(arr1, n);
        
        System.out.println(ans);
    }

}
