// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class Jumps{

    static int minJumps(int[] arr){
        // your code here
        int jumps=1; // stores no. of jumps
        int maxReach=arr[0]; // how far can we jump
        int steps=arr[0]; // steps remaining, if this becomes zero means we performrd jump
        if(arr[0] == 0) return -1;
        for(int i=1; i<arr.length-1; i++){
            steps--;
            maxReach = Math.max(maxReach, i + arr[i]);
            if(steps==0){
                jumps++;
                // Check if we have reached end of maximum reach and can't move fwd
                if(maxReach <= i) return -1;
                steps = maxReach - i;
            }
        }
    return jumps;
    }
    
    public static void main(String[] args){
    int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    int ans = minJumps(arr);
    System.out.println("Min jumps are:\n " + ans);
    
    }
}
    
    
    