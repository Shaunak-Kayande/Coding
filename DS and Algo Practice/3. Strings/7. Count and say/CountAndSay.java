import java.util.*;
import java.io.*;

public class CountAndSay {

    public static String countAndSay(int n) {
        int count = 0;
        String str = "1";
        for(int i=2; i<=n; i++){
            StringBuilder temp = new StringBuilder();
            count = 1;
            for(int j=1; j< str.length(); j++){
                if(str.charAt(j) == str.charAt(j-1)) count++;
                else{
                    temp.append(count);
                    temp.append(str.charAt(j-1));
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(str.charAt(str.length()-1));
            str = temp.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }
}