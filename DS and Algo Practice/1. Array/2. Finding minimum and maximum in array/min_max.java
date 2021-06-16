import java.io.*;
import java.util.Scanner;

class min_max {
    
    static class minmax{
         int min;
         int max;
    }
    
    static minmax findminmax(int[] array, int n){
        minmax m = new minmax();
        int i;
        if(n%2 == 0){
            if(array[0] > array[1]){
                m.min = array[1];
                m.max = array[0];
            }
            else{
                m.min = array[0];
                m.max = array[1];
            }
            i = 2;
        }
        else{
            m.min = array[0];
            m.max = array[0];
            i = 1;
        }
        
        while(i < n-2){
            if(array[i] > array[i+1]){
                if(array[i] > m.max) m.max = array[i];
                if(array[i+1] < m.min) m.min = array[i+1];
            }
            else{
                if(array[i+1] > m.max) m.max = array[i+1];
                if(array[i] < m.min) m.min = array[i];
            }
            i += 2;
        }
        
        return m;
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int array[] = new int[n];
	    for (int i=0; i < n ; i++){
	        array[i] = sc.nextInt();
	    }
	    minmax m = findminmax(array, n);
	    
		System.out.println("Minimum element is " + m.min);
		System.out.println("Maximum element is " + m.max);
	}
}