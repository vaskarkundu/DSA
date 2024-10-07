package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
    //  is Anagram
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false; 
        }
    
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
    
       
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
    
        
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
    
       
        return sMap.equals(tMap);
    }

    public static int strStr(String haystack, String needle) {
        int beg = 0;
        int end = needle.length();

        for(int i = 0; i<haystack.length(); i = i + end){
    
            String x = haystack.substring(i, i + end);
            

            if(needle.equals(x)){
                return i;
            }
           
            
            if(end + end > haystack.length()){
                return - 1;
            }
            
            
           
            
        }
        return -1;

       

       
        
    }

    public static int addDigits(int num) {
       
        while ( num >= 10) {
            int res = 0;
            String x = Integer.toString(num);
           
            for(int i = 0; i<x.length(); i++){
                
                res += Character.getNumericValue(x.charAt(i));
            }
            num = res;
        }
        return num;
        
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        dictionary.sort(Comparator.comparingInt(String::length));
        System.out.println(dictionary);

       String[] s = sentence.split("\\s+");

       for(int i =0; i<dictionary.size(); i++){
        for(int j = i; j<s.length;j++){

            if(s[j].startsWith(dictionary.get(i))){
                s[j] = dictionary.get(i); 
                break; 
            }
            
        }
       }
        return String.join(" ", s);


       
    }

    // I can be placed before V (5) and X (10) to make 4 and 9. 
    // X can be placed before L (50) and C (100) to make 40 and 90. 
    // C can be placed before D (500) and M (1000) to make 400 and 900.

    public static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String [] x = s.split("");
        int n =0;
        String old = "";
        for(int i= x.length - 1; i>=0;i--){
           
            if(old.equals("V") && x[i].equals("I") || old.equals("X") && x[i].equals("I") || old.equals("L") && x[i].equals("X") ||old.equals("C") && x[i].equals("X") || old.equals("D") && x[i].equals("C") || old.equals("M") && x[i].equals("C")){
                n -= map.get(x[i]);
            }else{
                n +=map.get(x[i]);
            }
            old = x[i];
        }
      
        return n;
    }

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

public static String longestCommonPrefix(String[] strs) {
        
    
    
        String s = "";
        int size = 0;
        int chr = 0;
        int pos = 5;
        while (size < pos) {
            if(strs[size].startsWith(s)){
                if(!strs[size].equals(s)){
                    s+=strs[size];

                }
            }else{
                break;
            }

          


            // pos++;

            if(size == strs.length - 1){
                size = 0;
                chr++;
            }

            size++;
            
        }
        return s;
}

    

    public static void main(String[] args) {
       String[] str = {"flower","flow","flight"};
       String x = longestCommonPrefix(str);
       System.out.println(x);
    
    }
    
}
