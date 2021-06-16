public class AltPosotiveNegative {

    static void rearrange(int arr[], int n) {
        // code here
        int curr=1;
        int[] sol = new int[n];
        int neg=0, pos=0, i=0;
        while(i<n){
            if(curr < 0){
                if(arr[neg] < 0){
                    sol[i] = arr[neg];
                    i++;
                    neg++;
                    curr=1;
                }
                else neg++;
            }
            else{
                if(arr[pos] >= 0){
                    sol[i] = arr[pos];
                    i++;
                    pos++;
                    curr=-1;
                }
                else pos++;
            }
            if(neg == n) curr=1;
            if(pos == n) curr=-1;
        }
        
        for(i=0;i<n;i++){
            arr[i] = sol[i];
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            rearrange(arr1, n);
            for (int i : arr1) {
                System.out.println(i);
            }
        }
    
}
