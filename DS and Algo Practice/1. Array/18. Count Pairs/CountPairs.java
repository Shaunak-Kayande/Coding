
import java.util.*;
public class CountPairs {
    static int getPairsCount(int[] arr, int n, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
 
        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {
 
            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i])) hm.put(arr[i], 0);
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;
 
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null){
                twice_count += hm.get(sum - arr[i]);
                System.out.println((sum - arr[i]) + " " + hm.get(sum - arr[i]));
            }
            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }
 
        // return the half of twice_count
        return twice_count / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int count = getPairsCount(arr1, n, k);
        
        System.out.println(count);
    }
    
}
