public class MinHeights {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        // Default answer without changing anything
        int ans = arr[n-1] - arr[0];
        int smallest = arr[0] + k, largest = arr[n-1]-k;
        int min=0, max=0;
        // Use pair looping i.e comparing two consecutive elements
        // Adding k in 1st and subtracting from 2nd. 
        // Now point is that minimum wont be produced in other elements by adding
        // And maximum wont be produced by subtracting 
        // Just see if subtracting produces minimum element and adding produces maximum
        // Also see if their diff is maximum
        for(int i = 0; i < n-1; i++){
            min = Math.min(smallest, arr[i+1]-k);
            max = Math.max(largest, arr[i]+k);
            if(min < 0) 
                continue;
            ans = Math.min(ans, max-min);
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = nextPermutation(arr);
        
        System.out.println(ans);
        
    }
    
}
