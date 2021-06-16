/**
 * Code to separate positive and negative elements in array
 */

import java.util.Arrays;

public class PositiveNegative {

    public static void sort(int[] a, int n){
        int pos = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] < 0){
                temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
                pos++;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        sort(arr, arr.length);
        System.out.println("Array after seggregation:\n " + Arrays.toString(arr));
        
    }
    
}
