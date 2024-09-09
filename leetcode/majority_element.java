package leetcode;

public class majority_element {
    public static int mooreyVotingAlgo(int [] arr){
        int majority = arr[0];
        int voting = 1;
        for(int i=0; i<arr.length; i++){
            if(voting == 0){
                voting++;
                majority = arr[i];
            }
            else if(majority == arr[i]){
                voting++;
            }
            else{
                voting--;
            }

        }
        return majority;
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,2};
        System.out.println(mooreyVotingAlgo(arr));
    }
}
