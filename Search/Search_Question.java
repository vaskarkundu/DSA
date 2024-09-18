package Search;

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

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int x = binarySearch(nums, 4);
        System.out.println(x);
    }
    
}
