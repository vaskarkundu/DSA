package Two_Pointers;

import java.util.ArrayList;

public class two_pointers {

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int ini = 0;
        int res = 0;
        while (ini<arr1.length) {
            boolean x = true;
            int val = arr1[ini];
            for(int i =0; i<arr2.length; i++){
                if(!(Math.abs(val - arr2[i]) > d)){
                    x = false;
                    break;
                }
            }
            if(x){
              
                res++;
            }
            ini++;
            
        }
        return res;
    }

    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();

        int ini = 0;
        int size = result.length() - 1;
        while (ini < size) {
            if(!(result.charAt(ini) == result.charAt(size))){
                return false;
            }
            ini++;
            size--;
            
        }

        return true;
    }

    public static boolean isHappyRecursion(int n, int pre){
        if(n == 1 ){
            return true;
         }
         int z = 0;
             
            while (n > 0) {
                int num = n % 10;
                z += num*num;
                 n = n / 10; 
             }

        if(z == pre){
            return false;
        }

        return isHappyRecursion(z,pre);

        
    }

    public static boolean isHappy(int n) {
        int match = n;
        while (n > 0) {
            int z = 0;
            while (n > 0) {
                int num = n % 10;
                z += num*num;
                n = n / 10; 
             }

             
             if(z == match){
                 return false;
                }
                if(z == 1){
                    return true;
                }
             n = z;    
        }

        return false;    
    }


    public static void main(String[] args) {
      
        boolean d = isHappy(4);
        System.out.println(d);

        
    }
    
}
