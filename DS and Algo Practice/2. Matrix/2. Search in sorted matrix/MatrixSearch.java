import java.io.*;
import java.util.*;

public class MatrixSearch {

    public static boolean searchMatrix(int[][] matrix, int target) {
        
        int i=0, j=0, flag=-1;
        int n = matrix.length, m = matrix[0].length;
        
        
        for(i=0; i< n; i++){
            if(matrix[i][0] <= target && matrix[i][m-1] >= target){
                flag = i;
                break;
            }
        }

        if(flag == -1) return false;
        else if(matrix[i][0] == target) return true;
        
        for(j=0; j< m; j++)
            if(matrix[flag][j] == target) return true;
        
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
