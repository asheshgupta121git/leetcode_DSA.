package leetcode;
public class rotaedArray {
    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverseArr(int arr[], int start, int end){
       while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
       }
       
    }

    public static void reverseAtIndex(int arr[], int key){
        int len = arr.length; // array lenght
        key = key%len;
        reverseArr(arr, 0, key);
        reverseArr(arr, key+1, len-1);
        reverseArr(arr, 0, len-1);
    }

    public static void main(String[] args) {
        int arr[] = {99,-1,-100,3};
        int key =2;
        reverseAtIndex(arr, key);
       
        printArr(arr);

    }
}