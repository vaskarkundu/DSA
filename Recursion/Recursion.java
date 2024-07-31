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

    // print fibonacci serise till nth term
    public static void fibonacciSerise(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a +b;
        System.out.println(c);
        fibonacciSerise(b, c, n-1);

    }


    public static void main(String[] args) {
        //recursion problem
        // printNum(1);
        // printNaturalSum(1,5,0);
        int a = 0, b= 1;
        System.out.println(a);
        System.out.println(b);
        int n = 10;
        fibonacciSerise(a,b,n-2);
    }
    
}
