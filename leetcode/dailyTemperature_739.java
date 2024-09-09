package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class dailyTemperature_739 {

    public static int[] tempe(int [] temperatures){
      Stack <Integer> s = new Stack<>();

      int span[] = new int[temperatures.length];
    //   span[temperatures.length-1] = 0;
    //   s.push(0);
      for(int i = temperatures.length-1; i >=0; i--){
        int current = temperatures[i];
        while(!s.isEmpty() && current >= temperatures[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            span[i] = 0;
        }
        else{
            int prevHigh = s.peek();
            span[i] = prevHigh-i;
        }
        s.push(i);
      }
      return span;
    }

    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(tempe(temp)));
    }
    
}
