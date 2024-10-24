package Approach;

public class Diff_Approach {

    // Sliding Window Approach
    public static int maximumSubarray(int arr[], int k){
        if(arr.length < k) return -1;
        int max = 0;
        for(int i =0; i<k; i++){
            max += arr[i];

        }
        int windowSLiding = max;
        for(int i =k; i<arr.length; i++){
            windowSLiding = arr[i] - arr[i -k];
            max = Math.max(max, windowSLiding);
        }
        

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int x = maximumSubarray(arr, 3);
        
    }
    
}
