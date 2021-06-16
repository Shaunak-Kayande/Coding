// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


public class TrappingRainwater {

    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int leftmax=0, rightmax=0;
        int left=0, right=n-1;
        int water=0;
        while(left<right){
            if(arr[left] < arr[right]){
                if(leftmax <= arr[left]) leftmax = arr[left];
                else water += leftmax - arr[left];
                left++;
            }
            else{
                if(rightmax <= arr[right]) rightmax = arr[right];
                else water += rightmax - arr[right];
                right--;
            }
        }
        return water;
        
    } 

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            //calling trappingWater() function
            System.out.println(trappingWater(arr, n));
    }
}