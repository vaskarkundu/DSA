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
// ('+', '-', '*', '/'
    public static int calculate(String s) {

        Stack<String> stack = new Stack<>();
        String str = "";
        String carry = "";
        for(char ch : s.trim().replace(" ", "").toCharArray()){
            if(ch == '+' || ch == '-'  || ch == '*' || ch == '/' ){
                stack.push(carry);
                str +=ch;
                stack.push(str);
                str = "";
                carry = "";
            }else{
                 carry += ch;
            }
        }
        if(!carry.isEmpty()){
            stack.push(carry);
        }
        String cary = "";
        while (!stack.isEmpty()) {
            String curr = 

            // System.out.println(stack.peek());
            stack.pop();
        }
        return 0;
    }
// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2.
// Example 2:

// Input: nums = [1,2,3,4,3]
// Output: [2,3,4,-1,4]
   
    public static int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ar = new ArrayList<>();


    
        
        
        return nums;
    }

     

    public static String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();  
    
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                countStack.push(countStack.pop() + 1);
                if (countStack.peek() == k) {
                    stack.pop();
                    countStack.pop();
                }
            } else {
                stack.push(ch);
                countStack.push(1);
            }
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                str.append(ch);
            }
        }
    
        return str.reverse().toString();
        

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
                stack.push(ch);
                if(stack.size() >= 3){
                    char top = stack.peek();
                    if(top == 'c'){
                        if(stack.get(stack.size() - 2) == 'b' && stack.get(stack.size() - 3) =='a'){
                            stack.pop();
                            stack.pop();
                            stack.pop();
                        }
                    }
                }
               

            }else{
                stack.push(ch);
            }
        }

        

        return stack.size() == 0;
        
    }


    public static String reverseParentheses(String s) {

        Stack<String> stack = new Stack<>();
        String st = "";

        for(char ch : s.toCharArray()){
            if(ch == ')' || ch == '('){
                stack.push(st);
                st = "";

            }else{
                st += ch;
            }
        }
        String str = "";
        while (!stack.isEmpty()) {
           
            str +=stack.pop();
            
        }
        return str; 
    }

    public static int binarySearch(int[] arr, int ter){

        int high = arr.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) /2;

            if(arr[mid] == ter){
                return mid;
            }else if(arr[mid] < ter){
                low = mid + 1;
            }else{
                 high = mid- 1;

            }
            
        }
       
        return -1;
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> li = new ArrayList<String>();
        int ini = 1;
        int last = target[target.length -1] ;

        while (ini <= n) {

            if(ini > last){
                break;
            }

            int x = binarySearch(target, ini);
            if(x == -1){
                li.add("push");
                li.add("pop");
            }else{
                li.add("push");
            }

          

            ini++;
            
        }
        return li;
        
    }

    public static int minimumDeletions(String s) {

        Stack<Character> stack = new Stack<>();
        int delete = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'b'){
                stack.push(ch);
            }else if(ch == 'a'){
                if(!stack.isEmpty()){
                    delete++;
                    stack.pop();

                }
            }
           
        }

        return delete;
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '*'){

                if(!stack.isEmpty()){
                    stack.pop();
                }

            }else{
                stack.push(ch);
            }
        }
        if(stack.size() == 0) return "";
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

    public static void main(String[] args) {


        String s = removeStars("erase*****");
        System.out.println(s);

     
    }
    
}
