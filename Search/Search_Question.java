package Search;

import java.util.Arrays;

public class Search_Question {
    
    public static int binarySearch(int[] arr, int ter){

        int high = arr.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) /2;

            if(arr[mid] == ter){
                System.out.println("first"+arr[mid]);
                return mid;
            }else if(arr[mid] < ter){
                System.out.println("low"+arr[mid]);
                low = mid + 1;
            }else{
                System.out.println("high"+arr[mid]);
                 high = mid- 1;

            }
            
        }
       
        return -1;
    }

     public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            
            int mid = left + (right - left)/2;
            
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }  
            
        }
        return nums[left];
        
    }

    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        int x = findMin(nums);
        System.out.println(x);
    }
    
}
