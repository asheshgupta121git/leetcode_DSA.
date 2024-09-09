package leetcode;

/**
 * rotatindString_796
 */
public class rotatindString_796 {
    public static Boolean rotatingString(String s, String goal){
        return ((s.length() == goal.length()) && (s+s).contains(goal));
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal =  "cdeab";

        // System.out.println(s+s);
        // System.out.println(s.length() == goal.length() && (s+s).contains(goal));

        // System.out.println(rotatingString(s, goal));
//--------------------------------------------------------------------------------------------------------------

        //rotate String by 2 place 
        String str = "amazon";
        // result siring will be "azonam"
        char ch;

        String frist = str.substring(0,2); 
        System.out.println(frist);
        String second = str.substring(2);
        System.out.println(second);

        String rev ="";
        for(int i =0;i<frist.length();i++){
            ch = frist.charAt(i);
            rev = ch + rev;        }
        System.out.println(rev);
        String rev2 = "";
        for(int i=0;i<second.length();i++){
            ch = second.charAt(i);
            rev2 = ch + rev2;
        }
        System.out.println(rev2);

        String ans = rev+rev2;
        System.out.println(ans);
        String rev3 = "";
        for(int i=0;i<ans.length();i++){
            ch = ans.charAt(i);
            rev3 = ch + rev3;
        }

        System.out.println(rev3);




    }
}