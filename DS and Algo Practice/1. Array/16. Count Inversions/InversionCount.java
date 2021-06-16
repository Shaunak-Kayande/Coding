public class InversionCount {
    static long invcount;
    static void merge(long arr[], long l, long m, long r){
        long n1 = m-l+1;
        long n2 = r-m;
        long i=0, j=0, k=l;
        long L[] = new long[(int)n1];
        long R[] = new long[(int)n2];
        for(i=0; i<n1; i++){
            L[(int)i] = arr[(int)(i+l)];
        }
        for(i=0; i<n2; i++){
            R[(int)i] = arr[(int)(m+1+i)];
        }
        i=0; 
        j=0;
        while(i<n1 && j<n2){
            if(L[(int)i] > R[(int)j]){
                arr[(int)k] = L[(int)i];
                i++;
                invcount += n2 - j;
            }
            else{
                arr[(int)k] = R[(int)j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[(int)k] = L[(int)i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[(int)k] = R[(int)j];
            j++;
            k++;
        }
    }
    static void sort(long arr[], long l, long r){
        
        if(l < r){
            long m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
        
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        invcount = 0;
        sort(arr, 0, N-1);
        return invcount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int count = nextPermutation(arr1, n);
        
        System.out.println(count);
    }
}
