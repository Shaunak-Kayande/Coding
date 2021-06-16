// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
      public class MaxProdSub {

        static long maxProduct(int[] arr, int n) {
            // code here
            // long product=1, maxproduct=1;
            // long negative=0;
            long maxproduct=arr[0], temp1=0, temp2=0;
            long mintillhere=arr[0], maxtillhere=arr[0];
            for(int i=1; i<n; i++){
                // if(arr[i] > 0){
                //     product *= arr[i];
                //     if(product > maxproduct) maxproduct = product;
                //     System.out.println("Arr[i] " + arr[i] + "Product " + product + "maxproduct" + maxproduct);
                // }
                
                // else if(arr[i] < 0){
                //     if(negative*arr[i] > 0) {
                //         product = negative*arr[i];
                //         if(product > maxproduct) maxproduct = product;
                //         System.out.println("Arr[i] " + arr[i] + "Product " + product + "Negative " + negative + "maxproduct " + maxproduct);
                //         negative=product;
                //     }
                //     else {
                //         negative = product*arr[i];
                //         product = 1; 
                //         System.out.println("Arr[i] " + arr[i] + "Product " + product + "Negative " + negative);
                        
                //     }
                // }
                
                // else if(arr[i] == 0){
                //     product = 1;
                //     negative = 1;
                // } 
                temp1 = maxtillhere*arr[i];
                temp2 = mintillhere*arr[i];
                maxtillhere = Math.max(arr[i], Math.max(temp1, temp2));
                mintillhere = Math.min(arr[i], Math.min(temp1, temp2));
                if(maxtillhere > maxproduct) maxproduct = maxtillhere;
            }
            return maxproduct;
        }
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }

            long ans = maxProduct(arr1, n);
            
            System.out.println(ans);
        }
    }
   