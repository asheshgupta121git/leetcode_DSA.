package leetcode;

public class lengthOfLastWord_58 {
   public static void main(String[] args) {
    String str = "ashesh gupta";
    //last word gupta length is = 5;
    String arr [] = str.split(" ");
    System.out.println(arr[arr.length-1].length());
   }
    
}
