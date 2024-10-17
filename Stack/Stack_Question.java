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



    public static void main(String[] args) {
        String[] ops = {"5","2","C","D"};
       int x = calPoints(ops);
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
