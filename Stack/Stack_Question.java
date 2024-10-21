package Stack;

import java.util.*;

public class Stack_Question {
    

    // solution  add value to bottom
    public static void addVlaueToBottom(Stack<Integer> s,int val){
        if(s.isEmpty()){
            s.push(val);
            return;

        }
        int tem = s.pop();
        addVlaueToBottom(s, val);
        s.push(tem);

    }

    // reverse a stack
    public static void reverseStack(Stack<Integer>s){

        if(s.isEmpty()){
            return;
        }

        int tem = s.pop();
        reverseStack(s);
        addVlaueToBottom(s, tem);


    }

   

    public static void backspace(Stack<Character> s, Stack<Character> t) {
        if (s.isEmpty() && t.isEmpty()) {
            return; 
        }
        if (!s.isEmpty()) {
            char sc = s.peek();
            if (sc == '#') {
             
                s.pop(); 
                if(!s.isEmpty()){

                    s.pop();
                }
                backspace(s, t);
            }
        }
    
       
        if (!t.isEmpty()) {
            char tc = t.peek();
            if (tc == '#') {
                t.pop();
                if(!t.isEmpty()){
                    t.pop();
                }
                
                backspace(s, t); 
            }
        }
    
       
        if (!s.isEmpty() && !t.isEmpty()) {
            
            char sx = s.pop();
            char tx = t.pop();
          
            backspace(s, t);
           
            s.push(sx);
            t.push(tx);
        }
    }




   
    
    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> sStack = back(s);
        Stack<Character> tStack = back(t);

        return sStack.equals(tStack);
        
    }

    public static Stack<Character> back(String str){

        Stack<Character> s = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '#'){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }

        return s;

    }

    public static int calPoints(String[] operations) {

        Stack<String> s = new Stack<>();
        for(String sr : operations){
            
            if(sr == "C"){
                if(!s.isEmpty()){
                    s.pop();
                }
                
            }
            if(sr=="D"){
                if(!s.isEmpty()){
                    String d = s.peek();
                    String x =String.valueOf(Integer.parseInt(d)*2);
                    s.push(x);

                }
               
            }
            if(sr == "+"){
                int cou = 0;
                while (!s.isEmpty()) {
                    cou += Integer.parseInt(s.pop()) ;
                    
                }
                s.push(String.valueOf(cou));
                
            }

            s.push(sr);

        }

        int count = 0;

        //  while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
            
        // }

        // while (!s.isEmpty()) {
        //     count += Integer.parseInt(s.pop()) ;
        // }


        return count;
    }

   
    public static int[] _nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> nexHashMap = new HashMap<>();

        for(int num : nums2){

            if(!stack.isEmpty() && num > stack.peek()){
                nexHashMap.put(stack.pop(), num);

            }

            stack.push(num);
        }

        while (!stack.isEmpty()) {
            nexHashMap.put(stack.pop(), -1);
            
        }

        int[] res = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            res[i] = nexHashMap.getOrDefault(nums1[i],-1);
        }


        return res;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

      
        for (int num : nums2) {
           
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

       
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

       
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1); 
        }

        return result;
    }


    public static String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        int checker = 0;
        String sh = "";
        String str = "";
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) != ch){
                stack.push(word.charAt(i));
            }else{
                checker++;
                stack.push(word.charAt(i));
                sh += word.substring(i+1, word.length());
                break;

            }
        
        }
        if(checker == 0) return word;
        while (!stack.isEmpty()) {
            str += stack.pop();
            
        }
      
        return str + sh;
    }

    public static int minLength(String s) {
        // Stack<Character> stack = new Stack<>();
        // int size = s.length() -1;

        // while (size >= 0 ) {
        //     stack.push(s.charAt(size));
        //     size--;    
        // }
        // int ini = 0;
        // while (ini < 10) {

        //     char tem = stack.peek();

        //     if(tem == 'A'){
        //         char temone = stack.pop();
        //         char next = stack.peek();
        //         if(next == 'B'){
        //            if(!stack.isEmpty()){
        //             stack.pop();
        //            }
        //         }else{
                    
        //             stack.push(temone);
        //         }
                
        //     }else if(tem == 'C'){
        //         char temone = stack.pop();
        //         char next = stack.peek();
        //         if(next == 'D'){
        //            if(!stack.isEmpty()){
        //             stack.pop();
        //            }
        //         }else{

        //             stack.push(temone);
        //         }

        //     }

        //     ini++;

            
            
        // }

        // while (!stack.isEmpty()) {
        //     System.out.println(stack.peek());
        //     stack.pop();
            
        // }
        int ini = 0;
        int next = 1;
        int size = s.length();
        // while () {
            
        // }
        return 0;
    }

    public static String _clearDigits(String s) {

       Stack<Character> stack = new Stack<>();

       int count = 0;

       for(char a : s.toCharArray()){
        stack.push(a);
       }

       int size = stack.size();

       while (size >= 0) {

        char top = stack.peek();

        if('z' - top > 25){
            if(!stack.isEmpty()){
                count++;
                stack.pop();

            }

        }
        size--;
       }

       String str = "";

       while (!stack.isEmpty()) {
         
            str += stack.pop();

       }

       String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed.substring(0, reversed.length() - count);
        
    }


    public static String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();

        for(char st : s.toCharArray()){
            stack.push(st);
        }
        String str = "";
        int count = 0;
        int size = stack.size();

        while (size >= 0) {
 
         char top = stack.peek();
 
         if('z' - top > 25){
             if(!stack.isEmpty()){
                 stack.pop();
             }
 
         }
         size--;
        }

        return s;

    }


    
  


    public static void main(String[] args) {

//         Input: s = "ABFCACDB"
// Output: 2
// Explanation: We can do the following operations:
// - Remove the substring "ABFCACDB", so s = "FCACDB".
// - Remove the substring "FCACDB", so s = "FCAB".
// - Remove the substring "FCAB", so s = "FC".
// So the resulting length of the string is 2.
// It can be shown that it is the minimum length that we can obtain.

//    int s = minLength("ABFCACDB");
   String st = clearDigits("abc");


       
  
    
        
    }
    
}
