package leetcode;

import java.util.*;
public class array_merge {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void merge(int nums1[], int m, int nums2[], int n) {
        int  temp[] = new int[n+m];
        int k=0;
        for(int i=0;i<m;i++){
            temp [k++] = nums1[i];
        }
        for( int i =0;i<n;i++){
            temp[k++] = nums2[i];
        }
        Arrays.sort(temp);
        print(temp);

    }


    public static void main(String[] args) {
         int nums1 [] = { 1,2,3,0,0,0};
         int nums2[] = {2,5,6};
         int m=3, n=3;
         merge(nums1,m, nums2,n);
    }
}