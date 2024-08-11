package String;

public class String_question {

    public static void reverseString(char[] s) {
       

        char[] newArray = new char[s.length];  
        for (int i = 0; i < s.length; i++) {
            newArray[i] = s[s.length - 1 - i];  
        }
        System.out.println(newArray);
     
        
    }

    public static void main(String[] args) {
        char[] myCharArray = {'a', 'b', 'c', 'd', 'e'};
        reverseString(myCharArray);
        System.out.println('v');
    }
    
}
