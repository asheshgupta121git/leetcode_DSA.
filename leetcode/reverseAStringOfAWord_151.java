package leetcode;

public class reverseAStringOfAWord_151 {

    public static String reverse(String str){
        String word[] = str.split(" +");
        StringBuilder sb = new StringBuilder("");
        for(int i=word.length-1 ;i>=0;i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "  the man in great   ";
        System.out.println(str);
        System.out.println(reverse(str));

 
     
    }
    
}
