package Recursion;

public class Advance_question {

    // print all parmutation of a string
    public static void printPerm(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            printPerm(newString, permutation+curr);
        }
    }

    public static void main(String[] args) {
        System.out.println("done");
        printPerm("abcd","");
    }
    
}
