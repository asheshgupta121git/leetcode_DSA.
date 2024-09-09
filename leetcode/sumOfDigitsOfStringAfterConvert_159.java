package leetcode;

import java.util.Arrays;


public class sumOfDigitsOfStringAfterConvert_159 {

    public static int getlucky(String s, int k){
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c - 'a' +1); // subtracting asicc value like 'c' = 99 and 'a' = 97 so 'c'-'a' + 1 == 99-97 +1 = 3;
        }
        // System.out.println(sb);

        String strs = sb.toString();
        // System.out.println(strs);
        while (k>0) {
            int sum =0;
            for(char c:strs.toCharArray()){
                sum = sum + c - '0'; // here assic value of '0' = 48 and to goes to '9' = 57.
                // System.out.print(sum + " ");
            }
            strs = String.valueOf(sum);
            k--;
        }
        // System.out.println();
        // System.out.println(Integer.parseInt(strs));

        return Integer.parseInt(strs);
  
    }
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(getlucky(str, 2));
       

        

    }
    
}
