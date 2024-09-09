package leetcode;
/**
 * MAX_count_one_485
 */
public class MAX_count_one_485 {
    public static void maxOne(int arr[]){
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i != 1){
                count =0;
                
            }
          
            else{
               count ++;
               max = Math.max(count, max);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr [] ={1,1,0,1,0,1};
        maxOne(arr);

    }
}