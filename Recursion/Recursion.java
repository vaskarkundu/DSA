package Recursion;

public class Recursion {
   

    // print 5 to 1;
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static void main(String[] args) {
        //recursion
        printNum(5);
    }
    
}
