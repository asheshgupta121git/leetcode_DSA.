package leetcode;

public class trappedRainWater42 {
    public static int trapped(int height[]){
        int n = height.length;
        //leftmax
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //rightmax
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
       
       
        int waterLevel[] = new int [n];
        int trappedWater = 0;
        for( int i=0;i<n;i++){
            //water level = min(leftMAx, rightMax)
            waterLevel[i] = Math.min(leftMax[i],rightMax[i]);

            //trapped water = water level - height;
            trappedWater += waterLevel[i] - height[i];


        }    
        return trappedWater;

    }

    public static void main(String[] args) {
        int arr[] ={4,2,0,3,2,5};
    
        System.out.println(trapped(arr));

     

    }
    
}
