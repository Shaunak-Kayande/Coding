import  java.lang.Math;
import java.util.Arrays;
class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        int i=0, j=0;
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        
        for(i=0; i<n-1; i++){
            if(intervals[i][1] >= intervals[i+1][0]){
                intervals[i+1][0] = Math.min(intervals[i][0], intervals[i+1][0]);
                intervals[i+1][1] = Math.max(intervals[i][1], intervals[i+1][1]);
                intervals[i][0] = -1;
                j++;
            }
        }
        int[][] merged = new int[n-j][2];
        j=0;
        for(i=0; i<n; i++){
            if(intervals[i][0] != -1){
                merged[j] = intervals[i];
                j++;
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        int merged[][] = merge(arr);
        for (int i = 0; i < merged.length; i++) {
            System.out.print(Arrays.toString(merged[i]) + " ");
        }
        System.out.println();
    }
}