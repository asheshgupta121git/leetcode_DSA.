package leetcode;
public class jumpGame_55 {
    public static boolean canJump(int nums[]){
        int reach = 0;
        for(int i = 0 ;i< nums.length;i++){
            if(reach < i) return false;
            reach = Math.max(reach, i+nums[i]);
        }
        return true;

        // --------- greedy approach -----------
        // int lastPos = nums.length-1;
        // for(int i = nums.length-1;i>=0;i--){
        //     if(i + nums[i] >= lastPos) lastPos =i;
        // }
        // return lastPos ==0;
    }
    public static void main(String[] args) {
        int nums[] ={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
