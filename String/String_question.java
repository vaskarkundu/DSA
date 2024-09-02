package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

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

    public static int alternateDigitSum(int n) {
        int ini = 0;

        return ini;
    }

     public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String[] parts = word.split(Character.toString(separator), -1); // Convert char to String for splitting
            for (String part : parts) {
                if (!part.isEmpty()) { // Exclude empty strings
                    result.add(part);
                }
            }
        }
        
        return result;
    }

    public static int countPrefixes(String[] words, String s) {

        int idx = 0;

        for(int i =0; i<=s.length(); i++){
            String prefix = s.substring(0, i);
            for(int j = 0; j<words.length; j++){
                if(prefix.equals(words[j])){
                    idx++;
                }
            }
        }

        return idx;
        
    }

    public static void main(String[] args) {
       
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int x = countPrefixes(words,s);
        System.out.println(x);
        // int x =similarPairs(c);
        // int y = finalValueAfterOperations(c);
        // // test(c);
        // // System.out.println(y);

        // List<String> words = List.of("one.two.three", "four.five", "six");
        // char separator = '.'; // Use a char for the separator
        
        // List<String> result = splitWordsBySeparator(words, separator);
        
        // // Print the result list
        // for (String str : result) {
        //     System.out.println(str);
        // }
    }
    
}
