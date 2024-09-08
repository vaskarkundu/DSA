package sorting;

import java.lang.reflect.Array;
import java.util.*;

public class Sorting_Question {

    // Majority element
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            numberMap.put(nums[i], numberMap.getOrDefault(nums[i], 0)+1);
        }
      
        double val = nums.length / 2.0;
        int res = 0;
       
        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
            
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value > val){
                res = key;
                
            }
           
        }
        
        return res;
        
    }
    //  slip overlap interval 
    public static int[][] merge(int[][] intervals) {
        int[][] ar = new int[2][2];

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {           
            for (int j = 0; j < intervals[i].length; j++) {     
                res.add(intervals[i][j]);
            }
            
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<res.size() - 1; i++){
            if(res.get(i) < res.get(i+1)){
               arr.add(res.get(i));
            }

        }
       
      
        System.out.println(arr);
        System.out.println(res);

        return intervals;
        
    }

    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> numberMap = new HashMap<>();
        boolean res = false;

        for(int i = 0; i<nums.length; i++){
            numberMap.put(nums[i], numberMap.getOrDefault(nums[i], 0)+ 1);
        }
        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()){
            Integer value = entry.getValue();
            if(value > 1){
                res = true;

            }
            
        }

        return res;
        
    }

    public static int missingNumber(int[] nums) {
        int res = 0;

        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == res){
                res++;
            }

        }

        return res;
        
    }

    public static int[] sorting(int[] arr){
        for(int i =0; i<arr.length - 1; i++){
            for(int j=0; j<arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        return arr;
    }

      public static int dominantIndex(int[] nums) {
       
       if(nums.length == 0) return -1;

       int maxIn = 0;
       for(int i = 0; i<nums.length; i++){
        if(nums[i] > nums[maxIn]){
            maxIn = i;
        }
       }

       for(int i=0; i<nums.length; i++){
        if(i != maxIn && nums[maxIn] < 2 * nums[i]){
            return -1;
        }
       }

       return maxIn;
        
    }

    public static int[] sortArrayByParity(int[] nums) {

        for(int i =0; i<nums.length - 1;i++ ){
            int small = i;
            for(int j = i+ 1; j<nums.length; j++){
                if(nums[small] % 2 != 0){
                    small = j;
                }
            }
            int temp = nums[small];
            nums[small] = nums[i];
            nums[i]=temp;
        }


     

        return nums;
        
    }


   
    public static void main(String[] args) {
        int[] x = {3,1,2,4};
        // boolean y = containsDuplicate(x);
        int[] y = sortArrayByParity(x);
        for(int s : y){
            System.out.println(s);
        }
        // System.out.println(y);
        // int y =majorityElement(x);
        // System.out.println(y);
        // int[][] x = {{1,2},{2,3}};
        // int[][] y = merge(x); 
        
    }
}
