/**
 * This program is to find lexographic nex permutation. 
 * If next permutation does not exist i.e. array is reversed sorted then just sort the array ascending
 */

public class Lexographic {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int x=0, flag=0, i=0, j=0, temp=0;
        for(i=n-1; i>0; i--){
            if(nums[i] > nums[i-1]) {
                flag = 1;
                break;
            }  
        }
        x = i-1;
        if(flag==1){
            for(i=n-1; i>0; i--){
                if(nums[i] > nums[x]) {
                    temp = nums[i];
                    nums[i] = nums[x];
                    nums[x] = temp;
                    break;
                }  
            }
            i = x+1;
            j = n-1;
            while((j-i) >= 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        else{
            i = 0;
            j = n-1;
            while((j-i) >= 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        nextPermutation(arr1);
        
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
    }
    
}
