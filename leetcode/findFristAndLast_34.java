package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findFristAndLast_34 {
    public static int[] searchRange(int nums[], int target){
        int arr[] = new int[2];
        arr[0] = findStart(nums, target);
        arr[1] = findEnd(nums, target);
        return arr;
    }

    public static int findStart(int nums[], int target){
        int index = -1;
        int start =0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start +(end - start)/2;
            if(nums[mid] >= target){
                end = mid-1;
            }else{
                start = mid+1;
            }

            if(nums[mid] == target) index = mid;
        }
        return index;
    }

    public static int findEnd(int nums[], int target){
        int index = -1;
        int start =0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start +(end - start)/2;
            if(nums[mid] <= target){
                start = mid+1;
            }else{
                end = mid-1;
            }

            if(nums[mid] == target) index = mid;
        }
        return index;
    }
 
    public static void main(String[] args) {
        
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    
}
