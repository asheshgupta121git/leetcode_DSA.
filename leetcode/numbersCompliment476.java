package leetcode;

public class numbersCompliment476 {

    public static void decToBin(int n){
        int pow =0;
        int bin = 0;

        while(n>0){
            int rem = n%2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }

        System.out.println(bin);
        binToDec(bin);
    }

    public static void binToDec(int n){
        int dec = 0;
        int pow =0;

        while (n>0) {
            dec = dec + (n%10 * (int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }
     public static int one (int num){
        int l = Integer.toBinaryString(num).length();
        int help = (1 << l) -1;
        return num^help;
     }
    
    public static void main(String[] args) {
        int n =5;
        // decToBin(n);
       System.out.println( one(n));
    }
    
}
