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
    public static int chekTime(int max,int nor, int less,int time){
        if(max <= 0 && nor <= 0 && less <=0){
            return time;
        }

        int[] amount = {max,nor,less};

        Arrays.sort(amount);

        if(amount[2] > 0 && amount[1] > 0){
            return chekTime(amount[2]-1, amount[1]-1, amount[0], time+1);

        }else if(amount[2] > 0){
            return chekTime(amount[2]-1, amount[1], amount[0], time+1);
        }

        return time;

    }
    // 2335. Minimum Amount of Time to Fill Cups
    public static int fillCups(int[] amount) {

        Arrays.sort(amount);
        

        return chekTime(amount[2], amount[1], amount[0], 0);
        
    }

    public static long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        
        long a = 0;
        long b = 0;
        for(int x : energyDrinkA){
            a +=x;   
        }
        for(int x : energyDrinkB){
            b +=x;   
        }

        int ini = 0;
        long total = 0;

        while (ini < energyDrinkA.length - 1) {

            if (energyDrinkA[ini] < energyDrinkB[ini + 1]) {
                
                total += energyDrinkB[ini + 1];
                ini++;  
            } else {
                
                total += energyDrinkA[ini];
            }
        
            ini++;  
        }

        long max = Math.max(total, Math.max(b, a));  
        

        return max;      
        
        

        
    }

    public static long _maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        long a = 0;
        long b = 0; 
        
        for (int x : energyDrinkA) {
            a += x;
        }
        for (int x : energyDrinkB) {
            b += x;
        }
    
        int ini = 0;
        long total = 0;
        boolean lastWasA = true;
    
        while (ini < energyDrinkA.length - 1) {
            if (lastWasA) {
                if (energyDrinkA[ini] < energyDrinkB[ini + 1]) {
                    // Switch to B
                    lastWasA = false;
                    total += energyDrinkB[ini + 1]; // Gain from B
                    ini++; // Cleansing is implicit due to the jump
                } else {
                    total += energyDrinkA[ini]; // Continue with A
                }
            } else {
                if (energyDrinkB[ini] < energyDrinkA[ini + 1]) {
                    // Switch to A
                    lastWasA = true;
                    total += energyDrinkA[ini + 1]; // Gain from A
                    ini++; // Cleansing is implicit due to the jump
                } else {
                    total += energyDrinkB[ini]; // Continue with B
                }
            }
            ini++; 
        }
    
        long max = Math.max(total, Math.max(b, a));
        return max;
    }
    
    // 1+1+1+1
    public static void main(String[] args) {
        // 1,3,1], energyDrinkB = [3,1,1]
        // c , w, h
        int [] n ={1,3,1};
        int [] m ={3,1,1};

         long x = maxEnergyBoost(n,m);
         System.out.println(x);
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
