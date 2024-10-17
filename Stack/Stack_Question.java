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



    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(5);
        s.push(10);
        s.push(15);
        addVlaueToBottom(s, 8);
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
        
    }
    
}
