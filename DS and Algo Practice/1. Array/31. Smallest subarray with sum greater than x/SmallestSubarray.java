import java.util.*;
import java.lang.*;
import java.io.*;

class SmallestSubarray {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.sb(a, n, m));
        }
	}
}


class Solution {

    public static long sb(long a[], long n, long x) {
        // Your code goes here 
        long sum=0, i=0, j=0, mincount= Long.MAX_VALUE, last=0;
        while(true){
            if(sum <= x){
                if(j >= n) break;
                sum += a[(int)j];
                j++;
            }
            
            if(sum > x){
                if(i >= n) break;
                if(j-i < mincount) mincount = j-i;
                sum = sum - a[(int)i];
                i++;
            }
        }
        return mincount;
    }
}

