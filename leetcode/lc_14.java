package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lc_14 {

    public static  String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int idx =0;
        while (idx<strs.length) {
            if (strs[0].charAt(idx) != strs[strs.length-1].charAt(idx)) {
                break;
            }
            else{
                idx++;
            }
        }
        return idx  == 0?"":strs[0].substring(0, idx);
    }
    public static void main(String[] args) {
        String nums[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(nums));
       
      

       
    }


    
}
