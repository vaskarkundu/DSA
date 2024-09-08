package Bit_Manupulation;

import java.lang.reflect.Array;
import java.util.*;

public class Bit_Manupulation_Question {
    
// Code
// Testcase
// Testcase
// Test Result
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
            res = lio.get(0) ^ lio.get(1);
        }

        return res;
        
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int y = duplicateNumbersXOR(nums);
        System.out.println(y);

        
    }
    
}
