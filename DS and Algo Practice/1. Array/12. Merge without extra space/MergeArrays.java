import java.util.*;
public class MergeArrays {
    public static void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int p1=n-1, p2=0, temp=0, i=0;
        int min = n;
        if(n>m) min = m;
	    while(true){
	        if(arr1[p1] > arr2[p2]){
	            temp = arr1[p1];
	            arr1[p1] = arr2[p2];
	            arr2[p2] = temp;
	            p2++;
	            p1--;
	        }
	        else p1--;
	        if(p1<0 || p2>=m) break;
	    }
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        merge(arr1, arr2, n, m);
        
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
    }
    
}
