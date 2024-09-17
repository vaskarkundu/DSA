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
        // System.out.println(primefactor[pr]);
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

    public static void main(String[] args) {
        boolean x = isUgly(6);
        System.out.println(x);
        
    }
    
}
