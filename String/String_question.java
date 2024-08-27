package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    // similar pari of string;
    public static int similarPairs(String[] words) {
        int count = 0;
        for(int i =0; i<words.length;i++){
            Set<Character> set1 = new HashSet<>();
            for(char c : words[i].toCharArray()){
                set1.add(c);
            }

            for(int j = i+1;j<words.length;j++){
                Set<Character> set2 = new HashSet<>();
                for(char c : words[j].toCharArray()){
                    set2.add(c);
                }
                if(set1.equals(set2)){
                    count++;
                }
            }

        }
        return count;
        
    }

    public static int numUniqueEmails(String[] emails) {
        
        Set<String> set1 = new HashSet<>();
        for(int i =0; i<emails.length;i++){
            set1.add(emails[i].replaceAll("\\.(?=[^@]*@)", "").replaceAll("\\+.*@", "@"));
        }


        return set1.size();
        
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        int numRows = strs.length;
        int numCols = strs[0].length();
        String[] result = new String[numCols];
           
            for (int i = 0; i < numCols; i++) {
                result[i] = "";
            }
            
            
            for (int col = 0; col < numCols; col++) {
                for (int row = 0; row < numRows; row++) {
                    result[col] += strs[row].charAt(col);
                    
                }
            }
            for(int i = 0; i< result.length; i++){
               for(int j = 0; j<result[i].length() -1;j++){
                if(result[i].charAt(j) > result[i].charAt(j+1)){
                    count++;
                    break;
                }
               }
            }
            
           
        return count;
        
    }

    public static int finalValueAfterOperations(String[] operations) {
        int initail = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("--X", -1);
        map.put("X--", -1);
        map.put("++X", 1);
        map.put("X++", 1);

        for(String s : operations){
            initail = initail + map.get(s);
        }
        

        return initail;
        
    }

    public static void main(String[] args) {
       
        String[] c = {"++X","++X","X++"};
        // int x =similarPairs(c);
        int y = finalValueAfterOperations(c);
        // test(c);
        System.out.println(y);
    }
    
}
