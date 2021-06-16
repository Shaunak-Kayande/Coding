import java.io.*;
import java.util.*;

public class RotateMatrix {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Transpose of matrix
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                swap(matrix, i, j, j, i);
            }
        }
        
        // Reverse every row
        for(int i=0; i<n; i++){
            int j=0, k=n-1;
            while(j < k){
                swap(matrix, i, j, i, k);
                j++;
                k--;
            }
        }        
    }
    
    public static void swap(int[][] matrix, int a, int b, int c, int d){
        
        int temp = matrix[a][b];
        matrix[a][b] =  matrix[c][d];
        matrix[c][d] = temp;
        
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String line = br.readLine();
        String[] element = line.trim().split("\\s+");
        int n = Integer.parseInt(element[0]);
        int m = Integer.parseInt(element[1]);
            
        int arr [][] = new int[n][m];
        
        line = br.readLine();
        String[] elements = line.trim().split("\\s+");
        int k=0;
        for(int i = 0; i<n; i++){
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(elements[k]);
                k++;
            }  
        }

        rotate(arr);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            } 
            System.out.println();  
        }
    }
    
}
