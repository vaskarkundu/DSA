package sorting;

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
    


    public static void main(String[] args) {

        int[] ar = {1,4,2,3,6,7,8,3};
        // devied(ar, 0, ar.length-1);
        int[] res = sortArray(ar);
        for(int s : res){
            System.out.println(s);

        }

        
    }
}
