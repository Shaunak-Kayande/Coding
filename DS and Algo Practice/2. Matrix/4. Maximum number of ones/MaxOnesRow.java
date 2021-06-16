import java.util.*;
import java.io.*;

public class MaxOnesRow {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}


class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i=0, j=m-1, maxcount=0, row=-1;
        while(i<n && j>=0){
            if(arr[i][j] == 1 ){
                maxcount++;
                row = i;
                j--;
            }
            else{
                i++;
            }
        }

        return row;
    }
}