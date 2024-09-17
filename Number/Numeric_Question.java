package Number;

import java.util.ArrayList;

public class Numeric_Question {

    public static boolean recur(int n,int pr){
        int[] primefactor ={2,3,5};
        if(primefactor.length -1 < pr)return false;
        if(n == 1)return true;
       if(n % primefactor[pr] != 0){
        recur(n, pr+1);
       }else{
        int m = n / primefactor[pr];
        recur(m, pr+1);
       }

       return false;
       
    }


    public static boolean isUgly(int n) {
          
           if (n <= 0) return false;
           if (n == 1) return true;
           if (n % 2 == 0) return isUgly(n / 2);
           if (n % 3 == 0) return isUgly(n / 3);
           if (n % 5 == 0) return isUgly(n / 5);
          
           return false;

    }

    public static int reversHelper(int x){
        return reverse(x, 0);

    }

    public static int reverse(int x,int res) {
        
       if(x == 0){
        return res;
       }
      
       int reminder = x % 10;
        
         if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && reminder > 7)) {
            return 0; 
        }
        if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && reminder < -8)) {
            return 0; 
        }

       res = res * 10 + reminder;
       return reverse(x/10,res); 
    }

    public static void main(String[] args) {
        int x = reversHelper(1534236469);
        System.out.println(x);
        
    }
    
}
