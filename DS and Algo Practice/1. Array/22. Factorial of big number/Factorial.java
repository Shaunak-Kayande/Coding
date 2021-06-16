

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Factorial{

    static ArrayList<Integer> factorial(int N){
        //code here
        int carry=0, i=0, j=0, temp, digits=1;
        ArrayList<Integer> fact = new ArrayList<Integer>();
        fact.add(1);
        for(i=2; i<=N; i++){
            carry = 0;
            for(j=0; j<digits; j++){
                temp = fact.get(j);
                temp = i*temp + carry;
                fact.set(j, temp%10);
                carry = temp/10;
            }
            while(carry != 0){
                fact.add(1);
                fact.set(digits, carry%10);
                carry = carry/10;
                digits++;
            }
        }
        Collections.reverse(fact);
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> ans = factorial(N);

        for (Integer val: ans) 
            System.out.print(val); 
        System.out.println();
  
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    
}