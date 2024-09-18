package Number;

import java.util.ArrayList;
import java.util.List;

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

    public static List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            if(i % 3 ==0 && i%5 ==0){
                myList.add("FizzBuzz");
            }else if(i % 5 == 0){
                myList.add("Buzz");
            }else if(i % 5 ==0){
                myList.add("Buzz");
            }else{
                myList.add(Integer.toString(i));
            }
        }

        return myList;
        
    }

    // public List<Integer> selfDividingNumbers(int left, int right) {
    //     List<Integer> seftDividing = new ArrayList<>();

    //     for(int i = left; i<=right; i++){
    //         if(i % 10)
    //     }

    //     return seftDividing;
    // }

    public static String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Initialize the result and carry
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int length1 = num1.length();
        int length2 = num2.length();

        // Add digits from the end to the beginning
        for (int i = 0; i < length1; i++) {
            int digit1 = num1.charAt(length1 - 1 - i) - '0';
            int digit2 = i < length2 ? num2.charAt(length2 - 1 - i) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        // If there's a carry left, add it
        if (carry > 0) {
            result.append(carry);
        }

     
        return result.reverse().toString();

        
        
    }


    public static String reverseWords(String s) {

        String[] part = s.trim().split("\\s+");
        ArrayList<String> x = new ArrayList<>();
        for(int i = part.length - 1; i> 0; i--){
            x.add(part[i]);
        }
        String str = String.join(" ", x);
        return str;
        
    }

    public static void main(String[] args) {
        String x = reverseWords("the sky is blue");
        System.out.println(x);
        
    }
    
}
