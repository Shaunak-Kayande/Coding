/**
 * WE are using prefix sum technique.
 * If for some element prefix some repeat then the whole sub array after the element at which it had same prefix sum has zero sum
 * arr = {4, 2, -3, 1, 6}
 * array      = 4 2 -3 1 6
 * prefix sum = 4 6  3 4 10
 * Here at index 3 sum is repeated ten that means sub array[1:3] has zero sum
 */
import java.util.*;
import java.lang.*;
import java.io.*;
    
class SumZero {

    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int i=0, psum = 0;
        Set<Integer> prefix = new HashSet<Integer>();
        prefix.add(0);

        for(i=0; i<n; i++){
            psum += arr[i]; 
            if(!prefix.contains(psum)) prefix.add(psum);
            else return true;
        }

        return false;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() ;
        int arr[] = new int[n];
        for(int i = 0; i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println(findsum(arr,n)==true?"Yes":"No");
    }
}
