package sorting;

import java.util.HashMap;
import java.util.Map;

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
    


    public static void main(String[] args) {
        int[] x = {3,2,3};
        int y =majorityElement(x);
        System.out.println(y);
        
    }
}
