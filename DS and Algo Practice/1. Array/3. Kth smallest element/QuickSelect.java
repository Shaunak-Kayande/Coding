/*
    Quick Select Algorithm:
    The algorithm is similar to QuickSort. The difference is, instead of recurring for both sides (after finding pivot), it recurs only for the part that contains the k-th smallest element
*/

import java.io.*;
import java.util.*;
class QuickSelect {

    public int partition(int[] arr, int start, int end){
        
        Random r = new Random();
        int randompivot = r.nextInt(end - start +1) + start;
        int temp = arr[randompivot];
        arr[randompivot] = arr[end];
        arr[end] = temp;
        
        int pivot = arr[end];
        int pIndex = start;
        
        for(int i=start; i<end; i++){
            if(arr[i] <= pivot){
                temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }

        temp = arr[end];
        arr[end] = arr[pIndex];
        arr[pIndex] = temp;

        return pIndex;

    }
    
    public int kthSmallest(int[] arr, int start, int end, int k) 
    { 
        int pIndex = partition(arr, start, end);
        
        if(pIndex == k-1) return arr[pIndex];
        
        else if(pIndex < k-1) return kthSmallest(arr, pIndex+1, end, k);
        else if(pIndex > k-1) return kthSmallest(arr, start, pIndex-1, k);
        
        return 0;
       
    } 

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		        arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    QuickSelect ob = new QuickSelect();
		    System.out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
	}
}

