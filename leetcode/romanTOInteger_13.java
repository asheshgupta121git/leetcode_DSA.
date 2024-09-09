package leetcode;

public class romanTOInteger_13 {
    public static int romTOInt(String s){
        int n = s.length();
        int arr[] = new int[n];
        int w=0;
            for(int i =0;i<n;i++){
                if(s.charAt(i) == 'I'){
                    arr[w++] = 1;
                }else if (s.charAt(i) == 'V') {
                    arr[w++] = 5;
                }else if (s.charAt(i) == 'X') {
                    arr[w++] = 10;
                }else if (s.charAt(i) == 'L') {
                    arr[w++] = 50;
                }else if (s.charAt(i) == 'C') {
                    arr[w++] = 100;
                }else if (s.charAt(i) == 'D') {
                    arr[w++] = 500;
                }else{
                    arr[w++] = 1000;
                }
            }
            int sum = arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--)
                {
                    if (arr[i]<arr[i+1]) {
                        sum -=arr[i];
                    }else{
                        sum += arr[i];
                    }
                }
            return sum;
        
    }
    public static void main(String[] args) {
        // I             1
        // V             5
        // X             10
        // L             50
        // C             100
        // D             500
        // M             1000

        String str = "III";
        // romTOInt(str);
        System.out.println(romTOInt(str));
    }
    
}
