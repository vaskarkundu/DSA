package Array;

import java.lang.reflect.Array;

public class Array_Question {
    public static boolean validMountainArray(int[] arr) {
        boolean res = true;
        boolean isIncrease = true;
        boolean isDecrease = true;
        boolean isvoilation = true;
        
      
        for(int i=0; i<arr.length -1;i++){
            if(arr[i]>arr[i+1]){
                if(isDecrease){
                    isvoilation = true;
                }
                isIncrease = true;
            }else{
                if(isIncrease){
                    isDecrease = true;

                }else{
                    isvoilation = true;

                }
            }

            
        }

        // System.out.println(desc);
        // System.out.println(count);
        return isvoilation;
        
    }
    public static int deleteGreatestValue(int[][] grid) {
        int initail = 0;

        for(int i = 0; i<grid.length; i++){
           for(int j = 0; j<grid[i].length; j++){
            System.out.println(grid[i][j]);
           }
        }

        return initail;
        
    }
    public static void main(String[] args) {
        System.out.println("done");
        int[][] arr = {
            {1, 2, 4},
            {3, 3, 1}
        };;
        int x=deleteGreatestValue(arr);
        System.out.println(x);
        
    }
}
