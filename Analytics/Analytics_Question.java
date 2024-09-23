package Analytics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Analytics_Question {

    public static int numberOfCuts(int n) {

        int x = 1 + (n*(n+1))/2;

        System.out.println(x);

        return n;
        
    }

    public static int distinctAverages(int[] nums) {

        Arrays.sort(nums);
        HashSet<Double> li = new HashSet<>();
       
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
           li.add(avg);
           left++;
           right--;
            
        }
        return li.size();
    }


    

    public static void main(String[] args) {
        int[] n= {9,5,7,8,7,9,8,2,0,7};
        int d = distinctAverages(n);
        System.out.println(d);

        // numberOfCuts(3);
        
    }
}
