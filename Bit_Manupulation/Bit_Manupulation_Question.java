package Bit_Manupulation;

import java.lang.reflect.Array;
import java.util.*;

public class Bit_Manupulation_Question {

// 3158. Find the XOR of Numbers Which Appear Twice
    public static int duplicateNumbersXOR(int[] nums) {

        Arrays.sort(nums);
        ArrayList<Integer> lio = new ArrayList<>();
        for(int i =0; i<nums.length - 1; i++){
            
            if((nums[i] ^ nums[i+1]) == 0){
               lio.add(nums[i]);
            }
        }
        int res = 0;

        if(lio.size() == 0){
            res = 0;

        }else if(lio.size() == 1){
            res = lio.get(0);
        }else{
            for(int i=0; i<lio.size();i++){
                res = res ^ lio.get(i); 
            }
            
        }

        return res;
        
    }

    public static boolean bitCheck(int x){
        return (x & 1) == 0;

    }
   
    // 

    public static boolean hasTrailingZeros(int[] nums){
        // for duble
        for(int i = 0; i<nums.length - 1; i++){
            for(int j =i+1; j<nums.length; j++){
                int calc = nums[i] | nums[j];
                if(bitCheck(calc)){
                    return true;
                }
            }
           
        }

        // for triple
        for(int i = 0; i<nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    int calc = nums[i] | nums[j] | nums[k];
                    if(bitCheck(calc)){
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public static boolean _hasTrailingZeros(int[] nums) {

        List<List<Integer>> allSubsets = new ArrayList<>();
        allSubsets.add(new ArrayList<>()); 

        for (int num : nums) {
            int size = allSubsets.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(allSubsets.get(i));
                subset.add(num);
              
                if(subset.size() > 1){
                    int calc = 0;
                    for(int j =0; j<subset.size(); j++){
                        calc |= subset.get(j);
                    }
                    
                    if(bitCheck(calc)){
                        return true;
                    }

                }
                allSubsets.add(subset);
            }
        }  
        return false;
       

        
    }


    


    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        // int y = duplicateNumbersXOR(nums);
        // System.out.println(y);
        boolean c = hasTrailingZeros(nums);
        System.out.println(c);

        
    }
    
}
