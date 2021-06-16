/**
 * QuickSort Algorithm
 */

import java.util.Arrays;

public class QuickSort {

    int partition(int[] arr, int start, int end){

        int pivot = arr[end];
        int pIndex = start;
        int temp=0;

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

    void sort(int[] arr, int start, int end){
        if(start < end){
            int pIndex = partition(arr, start, end);
            sort(arr, start, pIndex-1);
            sort(arr, pIndex+1, end);
        }
    }

    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int[] arr = {8, 6, 3, 2, 9, 1, 5, 7, 4};
        System.out.println("Orignal Array is:\n" + Arrays.toString(arr));
        s.sort(arr, 0, arr.length-1);
        System.out.println("Sorted Array By Quick Sort algorithm is:\n" + Arrays.toString(arr));
    }

    
}