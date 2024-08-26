package String;

import java.util.HashSet;
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

    public static void test(String[] w){
        Set<String> set1 = new HashSet<>();
        for(int i =0; i<w.length;i++){
            set1.add(w[i]);
        }

        System.out.println(set1);

    }

    public static int numUniqueEmails(String[] emails) {
        
        Set<String> set1 = new HashSet<>();
        for(int i =0; i<emails.length;i++){
            set1.add(emails[i].replaceAll("\\.(?=[^@]*@)", "").replaceAll("\\+.*@", "@"));
        }


        return set1.size();
        
    }

    public static void main(String[] args) {
        char[] myCharArray = {'a', 'b', 'c', 'd', 'e'};
        String[] c = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        // int x =similarPairs(c);
        int y = numUniqueEmails(c);
        // test(c);
        System.out.println(y);
    }
    
}
