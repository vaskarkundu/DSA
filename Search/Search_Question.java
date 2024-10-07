package Search;

import java.util.Arrays;

public class Search_Question {
    
    public static int binarySearch(int[] arr, int ter){

        int high = arr.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) /2;

            if(arr[mid] == ter){
                return mid;
            }else if(arr[mid] < ter){
                low = mid + 1;
            }else{
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
                right = mid - 1;
            }  
            
        }
        return nums[left];
        
    }
    //  1 2 3 4 5 
    public static int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low)/2;
             if(nums[mid] == target){
                return mid;
             }
            if(nums[mid] < target){
               low = mid + 1;
            }else{
                high = mid - 1;
            }   
        }
        
        
        return low;
    }

    public static void num(){
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
    }

  

    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        int x = searchInsert(nums, 100);
        // int x = findMin(nums);
        // System.out.println(x);
    }
    
}
