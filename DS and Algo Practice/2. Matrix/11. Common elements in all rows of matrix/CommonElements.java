import java.io.*;
import java.util.*;

class CommonElements {
    public static void commonElement(int[][] arr){
        
        HashMap<Integer, Integer> row = new HashMap<Integer, Integer>();
        int n = arr.length, m = arr[0].length;
        
        for(int i=0; i<m; i++)
            row.put(arr[0][i], 1);
            
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                
                if(row.containsKey(arr[i][j])){
                    
                    row.put(arr[i][j], row.get(arr[i][j]) + 1);
                    if(i == n-1)
                        if(row.get(arr[i][j]) == n) System.out.print(arr[i][j] + " ");
                        
                } 
            }
        }
    }
    
    public static void main (String[] args) {
        int mat[][] = {
            {1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9},
        };
    
        commonElement(mat);
    }
}