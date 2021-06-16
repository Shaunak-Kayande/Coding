import java.io.*;
import java.util.*;

public class SearchMatrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        int  i=0, j = matrix[0].length-1, n = matrix.length;
        
        while(i<n && j>=0){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] < target) i++;
            else if(matrix[i][j] > target) j--;
        }

        return false;
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

        int K = Integer.parseInt(br.readLine());
        
        boolean ans = searchMatrix(arr, K);
        System.out.println(ans);
    }
    
}
