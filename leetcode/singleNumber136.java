package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class singleNumber136 {
public static int single(int arr[]){
    int ans = 0;
    for(int i=0;i<arr.length;i++){
        ans = ans^arr[i];
      
    }
    return ans;
}
    public static void main(String[] args) {
        int nums[] ={1,2,1,4,4,5,7,2,5,3,3};
        System.out.println(single(nums));

        
    }
}
