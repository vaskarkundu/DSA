package Bit_Manupulation;


import java.math.BigInteger;
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

    public static int min(int x, int y){
        if(x - y >= 0){
            return y;
        }else{
            return x;
        }

        
    }

    public static int maximumStrongPairXor(int[] nums) {
       

        int res = 0;

        for(int i =0; i<nums.length; i++){
            int calc = 0;
            for(int j = i+1; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) <= min(nums[i], nums[j])){
                    calc = nums[i] ^ nums[j];
                }
                if(calc > res){
                    res = calc;
    
                }
            }
           

        }

        return res;
        
    }
  

    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
         Arrays.sort(nums);
         int last = nums[nums.length - 1];
        for(int i =0; i<nums.length - 2; i = i+2){
            if( (nums[i] ^ nums[i+1]) != 0){

                return nums[i];
            }
        }
        return last;
        
    }
    // need to remember add binary ; how It works
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0|| carry == 1) {

            int sum = carry;

            if(i >=0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j >=0){
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
            
        }

        return result.reverse().toString();
        
    }

    public static int hammingWeight(int n) {

        String s = Integer.toBinaryString(n);
        
        int res = 0;
        for(int i = 0; i<s.length();i++){
            int x = s.charAt(i) - '0';
            if((x ^ 0) != 0){
                res++;
            } 
        }
        return res;
        
    }

    //  2917. Find the K-or of an Array
    
    public static int findKOr(int[] nums, int k) {
        return 1;
    }


    


    public static void main(String[] args) {
       
        int[] nums = {1,2,1,7,2,5,5};

        int c = hammingWeight(7);
        System.out.println(c);
       

        
    }
    
}
