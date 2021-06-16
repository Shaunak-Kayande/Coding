import java.io.*;
import java.util.*;

public class MinimumSwaps {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int K = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    int ans = obj.minSwap(arr, sizeOfArray, K);
		    System.out.println(ans);
		}
	}
}


class Complete{
    
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        
        int i=0, count=0, remain=0, minremain=Integer.MAX_VALUE;
        for(i=0; i<n; i++)
            if(arr[i] <= k) count++;
            
        if(count < 2) return 0;
        
        for(i=0; i<count; i++)
            if(arr[i] > k) remain++;
            
        minremain=remain;
        
        for(i=count; i<n; i++){
            if(arr[i-count] > k) remain--;
            if(arr[i] > k) remain++;
            if(remain < minremain) minremain=remain;
        }
        
        return minremain;
    }
    
    
}

