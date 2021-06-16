/**
 * This program implements Rabbit Tortoise Algorithm
 */

import java.util.*;
public class DuplicateElement {
    public static int findDuplicate(int[] nums) {
        int fast=nums[0];
        int slow=nums[0];
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast != slow);
        
        fast = nums[0];
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        
        return fast;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
    }
    
}
