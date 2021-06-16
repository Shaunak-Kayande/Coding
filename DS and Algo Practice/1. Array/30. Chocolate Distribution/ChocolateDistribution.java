import java.io.*;
import java.util.*;

public class ChocolateDistribution
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0;i<n;i++)
            {
                long x = sc.nextInt();
                arr.add(x);
            }
        long m = sc.nextLong();
        
        Solution ob = new Solution();
        
        System.out.println(ob.findMinDiff(arr,n,m));
        
    }
}// } Driver Code Ends


class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        
        long min= Long.MAX_VALUE, max=0, mindiff= Long.MAX_VALUE, k=1;
        mindiff = a.get((int)m - 1) - a.get(0);     // 1st and mth element difference

        for(long i=1; i< n - m + 1L; i++){
            min = a.get((int)i);
            max = a.get((int)(i+m) - 1);
            mindiff = Math.min(mindiff, max-min);   // Update if there's lesser difference
        }
        
        return mindiff;
    }
}
