import java.util.*;
public class TripletSum {
    public static boolean find3Numbers(int A[], int n, int X) { 
    
        int i=0, j=0, k=0, sum=0;
         Arrays.sort(A);
         
         for(i=0; i<n; i++){
             j = i+1;
             k = n-1;
             while(j<k){
                 sum = A[i] + A[j] + A[k];
                 if(sum == X) return true;
                 else if(sum < X) j++;
                 else if(sum > X) k--;
             }
         }
         return false;
     }

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        boolean ans = find3Numbers(arr1, n, x);
        System.out.println(ans ? "Yes" : "No");
    }
    
}
