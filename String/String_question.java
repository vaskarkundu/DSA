package String;

public class String_question {

    public static void reverseString(char[] s) {
       

        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left ++;
            right --;
        }
     
        
    }

    public static void main(String[] args) {
        char[] myCharArray = {'a', 'b', 'c', 'd', 'e'};
        reverseString(myCharArray);
        System.out.println('v');
    }
    
}
