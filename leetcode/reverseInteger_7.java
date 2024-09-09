package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.StyledEditorKit.BoldAction;

public class reverseInteger_7 {

    public static int binary(int[] arr, int key){
        int start =0;
        int end = arr.length;
        int mid ;
        while (start <= end) {
            mid = (start +end)/2;
            if (arr[mid] ==  key) {
                return mid;
            }
            else if(arr[mid] > key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }

//----------------------------------------------------------------------------------------------------
        public static Boolean  plaindrom(int num){
            int rev =0;
            int x = num;
            while(num != 0){
                int rem = num %10;
                rev = rev* 10 + rem;
                num = num/10;
            }
            if (x == rev) {
                return true;
            }
           return false;
        }

    public static void main(String[] args) {


        // int [] arr ={1,2,3,4,5};
        // int key = 4;
        // System.out.println(binary(arr,key));
        // System.out.println(Arrays.binarySearch(arr,5 ));
        // int arr1 [] ={ 1,6,4,2,5,3};

        int num =121;
        System.out.println(plaindrom(num));

       

       

        
    }
    
}
