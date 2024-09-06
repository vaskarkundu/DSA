package sorting;

import java.util.ArrayList;

public class Marge_sort {

    public static void conqure(int[] arr, int si, int ei, int mid){
        int[] marged = new int[ei - si +1];
        int idx1 = si;
        int indx2 = mid+1;
        int x = 0;
        while (idx1 <=mid && indx2 <= ei) {
            if(arr[idx1] <= arr[indx2]){
               marged[x++] = arr[idx1++];
            }else{
                marged[x++] = arr[indx2++];
            }
            
        }

        while (idx1 <=mid) {
            marged[x++] = arr[idx1++];
        }
        while (indx2 <= ei) {
            marged[x++] = arr[indx2++];
        }

        for(int i =0, j=si; i<marged.length;i++,j++){
            arr[j]=marged[i];
           }

    }


    public static void devied(int[] arr, int si, int ei){

        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;

        devied(arr, si, mid);
        devied(arr, mid+1, ei);
        conqure(arr, si, ei, mid);
        
    }

    public static int[] sortArray(int[] nums) {
        devied(nums,0,nums.length -1);
        return nums;
        
    }
    // need to customize value and return within nums1
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];

        for(int i =0; i<nums1.length; i++){
            res[i]=nums1[i];
        }
        for(int i =0; i<nums2.length; i++){
            res[nums1.length + i]=nums2[i];
        }

        nums1 = res;
        for(int i = 0; i<nums1.length; i++){
            if(nums1[i] != 0){
                nums1[i]=nums1[i];
            }
        }

        ArrayList<Integer> s = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++){
            if(res[i] !=0){
                s.add(res[i]);
            }
        }

        for(int i =0; i<s.size(); i++){
            nums1[i]=s.get(i);
        }
        
    }
      


    public static void main(String[] args) {

        int[] ar = {1,2,3,0};
        int[] ar1 = {4,5,6};
        merge(ar, 4, ar1, 3);
        // devied(ar, 0, ar.length-1);
        // int[] res = sortArray(ar);
        // for(int s : res){
        //     System.out.println(s);

        // }

        
    }
}
