package Array;
import java.util.*;

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
    // remove anagrams
    public static List<String> removeAnagrams(String[] words) {
        List<String> arr = new ArrayList<>();

        for(String s : words){
            arr.add(s);
        }

        for(int i =0; i<words.length - 1 ; i++){
            if(areAnagarms(words[i], words[i+1])){
                arr.remove(words[i+1]);
            }
          
        }
        return arr;
        }
    public static boolean areAnagarms(String a,String b){
        char[] arOne = a.toCharArray();
        char[] arrTwo = b.toCharArray();
        Arrays.sort(arOne);
        Arrays.sort(arrTwo);
        return Arrays.equals(arOne, arrTwo);
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int removeCount = (arr.length * 5) / 100;
        ArrayList<Integer> x = new ArrayList<>();
        double total = 0;
        for(int i = removeCount; i<arr.length - removeCount; i++){
            x.add(arr[i]);
            total += arr[i];
        }
        double res = total / x.size();

        return res;
        
    }
    public static void main(String[] args) {
        // // System.out.println("done");
        // // int[][] arr = {
        // //     {1, 2, 4},
        // //     {3, 3, 1}
        // // };;
        // // int x=deleteGreatestValue(arr);
        // String[] w = {"a","b","c","d","e"};
        // List<String> c =removeAnagrams(w);
        // System.out.println(c);
        int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};

        trimMean(arr);
        
    }
}
