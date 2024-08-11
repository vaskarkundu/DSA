package Recursion;
import java.util.*;

import java.lang.reflect.Array;

public class Recursion {
    // for first and last occurance element question static variable
    public static int first = -1;
    public static  int last = -1;
   

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
    
    public static int c = 0;
    public static int n = 0;
    public static boolean check = true; 
    // check if an array is sorted(strickly increase)
    public static boolean isStricklySorted(int[] arr,int i){
        if(check == false){   
            return check;
        }
        if(i == arr.length - 1){       
           return check;
        }
        c = arr[i];
        n = arr[i+1];
        if(n > c){
            check = true;

        }else{
            check = false;           
        }

        return isStricklySorted(arr, i+1);
    }
    // Move all "x" to the last in a element
    
    public static void moveElementinLast(String str, int i,int count,String newStr,char x){
      if(i == str.length()){
        
        for(int in =1; in<=count; in++){
            newStr += x;
        }
        System.out.println(newStr);
        System.out.println(count);
        return;
      }
      if(str.charAt(i) == x){
        count++;
      }else{        
        newStr += str.charAt(i);
      }
      moveElementinLast(str, i+1,count,newStr, x);
    }

    // Remove duplicates from a string 
    // (boss logic) remember this logic; all lower case char has a ASCII value a to z ==> 97 - 122;
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str,int i,String newStr ){
        if(i == str.length()){
        System.out.println(newStr);
        return;
       }
       char current = str.charAt(i);
       if(map[current - 'a']){
        removeDuplicates(str, i+1, newStr);
       }else{
        newStr += current;
        map[current - 'a']= true;
        removeDuplicates(str, i+1, newStr);
       }
    }

    // print all subsequence of string ==> time complexcity O(2^n)
    public static void subsequence(String str, int i, String newStr){

        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

         char x = str.charAt(i);
        // to be
        subsequence(str, i+1, newStr+x);

        // not to be
        subsequence(str, i+1, newStr);
    }

    // print all unique sunsequnce ==> time complexcity 
    public static void uniqueSubsequnce(String str, int i, String newStr,HashSet<String> set){
       if(i == str.length()){
         if(set.contains(newStr)){
            return;
         }else{
            System.out.println(newStr);
            set.add(newStr);
            return;
         }
       }

        char curr = str.charAt(i);
        uniqueSubsequnce(str, i+1, newStr+curr,set);
        uniqueSubsequnce(str, i+1, newStr,set);
    }

    // print keypad comb
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printFComb(String str,int idx,String nString){
        if(idx == str.length()){
            System.out.println(nString);
            return;
        }
        char curr = str.charAt(idx);
        String mapping = keypad[curr - '0'];
        for(int i =0; i<mapping.length();i++){
            printFComb(str, idx+1, nString+mapping.charAt(i));
        }
    }


    public static void main(String[] args) {
        printFComb("23", 0,"");
        // HashSet<String> set = new HashSet<>();
        // uniqueSubsequnce("aaa", 0,"", set);
        // subsequence("abc", 0,"");
        // removeDuplicates("abbaccddffee", 0, "");
        // moveElementinLast("abced", 0,0,"", 'e');
        // int[] x = {1,2,3,4,5,6,-100};
        // boolean c = isStricklySorted(x,0);
        // System.out.println(c);
        // firstLast("abaacdaefaahb", 0,'b');
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
