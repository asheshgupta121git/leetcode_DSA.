package leetcode;

import java.util.*;

public class letterCombinationOfAPhoneNumber_17 {

    public static List<String> letterCombination(String digits){
        LinkedList<String> output = new LinkedList<>();
        if(digits.length() == 0) return output;
        output.add("");

        String [] char_map = new String[] {"0", "1", "abc","def","ghi", "jkl", "mno","pqrs","tuv","wxyz"};
        
        for(int i=0; i<digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while (output.peek().length() == i) {
                String prem = output.remove();
                for(char c : char_map[index].toCharArray()){
                    output.add(prem + c);
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String s = "23";
        System.out.println(letterCombination(s));
    }
}
