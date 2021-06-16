import java.io.*;
import java.util.*;

public class SpiralTransversal
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                    matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        // code here
        ArrayList<Integer> spiral =  new ArrayList<Integer>();
            int count=0, m=c, n=r-1, traverse=0, i=0, j=0, k=0;
            
            while(k < c*r){
                
                //if(k == c*r) break;
                spiral.add(matrix[i][j]);
                count++;
                k++;
                //System.out.print(" i= " + i + " j= " + j + " count= " + count + " ");
                
                if(traverse==0){    // Tranverse from left to right
                    if(count == m){
                        traverse = 1;
                        i++;
                        m--;
                        count = 0;
                        //System.out.print(" m= " + m + " ");
                    }
                    else{
                        j++;
                    }
                }
                
                else if(traverse==1){   // Tranverse from top to bottom
                    if(count == n){
                        traverse = 2;
                        j--;
                        n--;
                        count = 0;
                        //System.out.print("n= " + n + " ");
                    }
                    else{
                        i++;
                    }
                }
                
                else if(traverse==2){   // Tranverse from right to left
                    if(count == m){
                        traverse = 3;
                        i--;
                        m--;
                        count = 0;
                        //System.out.print("m= " + m + " ");
                    }
                    else{
                        j--;
                    }
                }
                
                else if(traverse==3){   // Tranverse from bottom to top
                    if(count == n){
                        traverse = 0;
                        j++;
                        n--;
                        count = 0;
                        //System.out.print("n= " + n + " ");
                    }
                    else{
                        i--;
                    }
                }
                
            }
        return spiral;
    }
}
    
    