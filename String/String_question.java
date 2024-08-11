package String;

public class String_question {

    public static void reverseString(char[] s) {
        char[] newArray = new char[s.length+1];
        for(int i = s.length -1; i>=0; i--){
            newArray[i]=s[i];
        }
        System.out.println(newArray);
     
        
    }

    public static void main(String[] args) {
        char[] myCharArray = {'a', 'b', 'c', 'd', 'e'};
        reverseString(myCharArray);
        System.out.println('v');
    }
    
}
