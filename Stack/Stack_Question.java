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

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
             if(!stack.isEmpty()){
                char top = stack.peek();
                if((top == 'A' && ch == 'B' )||(top == 'C' && ch == 'D' )){
                    stack.pop();
                } else{
                    stack.push(ch);
                }

             }else{
                stack.push(ch);
             }
        }

       
       
        return stack.size();
    }

    

    public static String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if('z' - ch > 25){
                if(!s.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }

        String str = "";

        while (!stack.isEmpty()) {
          
             str += stack.pop();
 
        }

        if(str.length() == 0) return str;

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
       return reversed;
       
    }


    
    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
                char top = stack.peek();
                if(top == ch){
                    stack.pop();
                }else{
                    stack.push(ch);
                }

            }else{
                stack.push(ch);
            }
        }

        String str = "";

        while (!stack.isEmpty()) {
           
            str +=stack.pop();
            
        }

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
       return reversed;

      
        
    }

    public static int maxDepth(String s) {

        int max = 0;
        int depth = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                max++;
                if(max > depth){
                    depth++;
                }
            }
            if(ch == ')'){
                max--;
            }
        }

        
        return depth;
    }

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        String str = "";

        for(char ch : s.toCharArray()){
             if(!stack.isEmpty()){
                char top = stack.peek();
                if((Math.abs(top - ch) == 32 )){
                    stack.pop();
                } else{
                    stack.push(ch);
                }

             }else{
                stack.push(ch);
             }
        }

        if(stack.size() == 0) return str;
        while (!stack.isEmpty()) {
            str +=stack.pop();
            
            
        }
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
       return reversed;

    }


    public static void main(String[] args) {

        // Input: s = "(1)+((2))+(((3)))"

        // Output: 3


       String s = makeGood("leEeetcode");
       System.out.println(s);
     
    }
    
}
