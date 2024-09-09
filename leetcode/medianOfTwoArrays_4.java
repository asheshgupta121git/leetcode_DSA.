package leetcode;

public class medianOfTwoArrays_4 {

    public static double median(int [] nums1, int [] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int [] arr = new int[n+m];
        int idx1 =0;
        int idx2=0;
        int idx=0;
        while (idx1<n && idx2<m) {
            if(nums1[idx1] < nums2[idx2]){
                arr[idx++] = nums1[idx1++];
            }
            else{
                arr[idx++] = nums2[idx2++];
            }
        }

        while (idx1<n) {
            arr[idx++] = nums1[idx1++];
        }
        while (idx2<m) {
            arr[idx++] = nums2[idx2++];
        }

        int k = arr.length;

        if (k%2 ==0) {
            return (arr[k/2] + arr[k/2 -1])/2.0;
        }
        else{
            return (arr[k/2])/1.0;
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(median(nums1, nums2)) ;
    }
}
