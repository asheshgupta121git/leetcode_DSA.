package leetcode;
public class remove_from_duplicate_2 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static int remove2(int[] arr){
        if(arr.length < 3) return arr.length;
        int k=2;
        for(int i=2 ;i<arr.length; i++){
            if(arr[i] != arr[k-2]){
                arr[k] = arr[i];
                k++;
            }
        }
        print(arr);
        return k;
    }
  
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,2,3,3};
      System.out.println(remove2(arr));
    }
    
}
