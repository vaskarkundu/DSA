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
   // print x^n (stack height)    
    public static int printStackHieght(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int xpowerm1 = printStackHieght(x, n-1);
        int xpower = x * xpowerm1;
        return xpower;
    }
    public static int printStackHightLogN(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n % 2 == 0){
            return printStackHieght(x, n/2) * printStackHieght(x, n/2);
        }else{
            return printStackHieght(x, n/2) * printStackHieght(x, n/2) * x;
        }
       
    }

    public static boolean powerof2(int x){
        if(x == 1){
            return true;
        }
       
        if (x < 1 || x % 2 != 0) {
            return false;
        }
        return powerof2(x/2);
        // return true;
    }

    // tower of hanoi
    public static void towerofHanoi(int n, String s, String h,String d){
        if(n == 1){
            System.out.println("transer dist " + n +" from " +s +"to "+d);
            return;
        }
        towerofHanoi(n-1, s, d, h);
        System.out.println("transer dist " + n +" from " +s +"to "+d);
        towerofHanoi(n-1, h, s, d);

    }
    // print reverse a string
    public static void printReverse(String str,int i){
        if(i == 0){
            return;
        }
        
        System.out.println(str.charAt(i-1));
        printReverse(str,i-1);
    }
    public static int first = -1;
    public static  int last = -1;
    // find the first and last occuraence of an element in string
    public static void firstLast(String str,int i,char x){
        
        if(i == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
       
        if(str.charAt(i) == x){
            if(first == -1){
                first = i;
            }else{
                last = i;
            }
        }
        firstLast(str, i+1,x);
    }


    public static void main(String[] args) {
        firstLast("abaacdaefaahb", 0,'b');
        // printReverse("abcdef", 6);
        // towerofHanoi(4, "s","h","d");
        //recursion problem
        // printNum(1);
        // printNaturalSum(1,5,0);
        // int a = 0, b= 1;
        //  System.out.println(a);
        // System.out.println(b);
        // int n = 10;
        // fibonacciSerise(a,b,n-2);
        // int x =printStackHieght(3, 3);
        // int x = printStackHightLogN(3, 3);
        // System.out.println(16%2);
        // boolean x = powerof2(16);
        // System.out.println(x);
      
    }
    
}
