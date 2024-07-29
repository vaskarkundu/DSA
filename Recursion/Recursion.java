package Recursion;

public class Recursion {
   

    // print 5 to 1;
    public static void printNum(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }

    // print sum of the first N nutural number

    public static void printNaturalSum(int i,int n, int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printNaturalSum(i+1, n, sum);
       
       
    }

    // print factorial of number N
    public static void printFactorial(int n,int s){

        if(n == 0){
            System.out.println(s);
            return;
        }

        s *=n;
    
        printFactorial(n-1,s);
         
         
    }

    public static void main(String[] args) {
        //recursion
        // printNum(1);
        printNaturalSum(1,5,0);
        printFactorial(5,1);
    }
    
}
