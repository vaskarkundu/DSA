package Backtracking;

public class Backtracking_question {
    // all possible combination of a string ==> O(n * n!)
    public static void permutationOfString(String str,String perm, int n){

        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i =0; i<str.length(); i++){
            char curr = str.charAt(i);
            String neString = str.substring(0, i) + str.substring(i+1);
            
            permutationOfString(neString, perm + curr, n+1);
        }

    }

    public static void main(String[] args) {

        String x = "abc";
        permutationOfString(x, "", 0);
        
    }
    
}
