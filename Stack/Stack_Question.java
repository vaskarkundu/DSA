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

   
    public static int nexMatch(int val, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return -1;
        }
        int tem = stack.pop(); // Pop the top of the stack
        if (val == tem) {
            if (!stack.isEmpty()) {
                int next = stack.peek(); // Peek the next element without popping
                if (val < next) {
                    return next; // Return the next greater element
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
        return nexMatch(val, stack); // Continue recursion for remaining elements
    }
    
    

    

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer> s = new ArrayList<>();
    
        for (int i = 0; i < nums1.length; i++) {
            Stack<Integer> sta = new Stack<>();  
            for (int num : nums2) {
                sta.push(num);
            }
    
       
            int nex = nexMatch(nums1[i], sta);
            s.add(nex);
        }

       System.out.println(s);
    
       
        int[] result = new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            result[i] = s.get(i);
        }
    
        return result; 
    }
    

    



    public static void main(String[] args) {
       
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] c = nextGreaterElement(nums1, nums2);

        for(int s : c){
            System.out.println(s);
        }
    //     String[] ops = {"5","2","C","D"};
    //    int x = calPoints(ops);
    //    System.out.println(x);

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(5);
        // s.push(10);
        // s.push(15);
        // addVlaueToBottom(s, 8);
        // reverseStack(s);
        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
            
        // }
        
    }
    
}
