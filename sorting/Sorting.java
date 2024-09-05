package sorting;

import java.lang.reflect.Array;
import java.util.*;

public class Sorting {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // marge sort start ==> Time complexity is O(nlogn)
    public static void conqure(int[] arr, int mid, int si, int end){
        int[] marged = new int[end - si + 1];
        int ind1 = si;
        int indx2 = mid+1;
        int x = 0;
        while (ind1<=mid && indx2 <=end) {
            if(arr[ind1] <= arr[indx2]){
                marged[x++] = arr[ind1++];
            }else{
                marged[x++] = arr[indx2++];
            }
            
        }

        while (ind1<=mid) {
            marged[x++] = arr[ind1++];
        }

        while (indx2 <= end) {
            marged[x++] = arr[indx2++];
        }

       for(int i =0, j=si; i<marged.length;i++,j++){
        arr[j]=marged[i];
       }

      

    }

    public static void devide(int[] arr,int si, int end){

        if(si >= end){
            return;
        }

        int mid = si + (end - si)/2;
        devide(arr, si, mid);
        devide(arr, mid+1, end);
        conqure(arr, mid, si, end);

    }

    // Question : sort linked list using marged sort (important problem)

    // marge sort end 
    // claculation of minimum avrage
    public static double minimumAverage(int[] nums) {
        ArrayList<Double> avarage = new ArrayList<>();
        int[] sortnums = sorted(nums);
       
        int start = 0;
        int end = sortnums.length - 1;
        while (start < end) {
            double ava = (sortnums[start] + sortnums[end]) / 2.0;
            avarage.add(ava);
            start++;
            end--;
            
        }
        
       Collections.sort(avarage);
        

        return avarage.get(0);
        
    }

    public static int[] sorted(int[] nums){
        for(int i =0; i<nums.length; i++){
            for(int j =0; j<nums.length - i -1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        
        return nums;
    }
    
    // number games

    public static int[] numberGame(int[] nums) {

        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();

        for(int i =0; i<nums.length - 1; i=i+2){
            res.add(nums[i+1]);
            res.add(nums[i]);

        }
        int[] result = new int[res.size()];
        for(int i =0; i<res.size(); i++){
            result[i]=res.get(i);

        }

        return result;
        
    }

    public static double average(int[] salary) {
       

        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<salary.length; i++){
            set.add(salary[i]);

        }
        double sum = 0.0;
        for (Integer value : set) {
            
            sum += value;
        }
       

       double len = set.size();

        return sum /len ;
       
        
    }
    public static void main(String[] args) {
        
        // 5,4,2,3
        int arr[]={8000,9000,2000,3000,6000,1000,1000};
        // double c = average(arr);
        // System.out.println(c);

        devide(arr, 0, arr.length -1);
        for(int s :arr){
            System.out.println(s);
        }
        // for(int s : res){
        //     System.out.println(s);
        // }
        // bubble sort ==> time complexcity O(n^2)
        for(int i =0; i<arr.length - 1; i++){
            for(int j=0; j<arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }

        // printArray(arr);

        // selection sort ==> time complexcity O(n^2)

        for(int i = 0; i<arr.length - 1;i++){
            int smallest = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        // printArray(arr);

        // Insertation sort ==> time complexcity O(n^2)

        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int j = i - 1;
            while (j >=0 && curr < arr[j]) {
                arr[j+1]=arr[j];
                j--;
                
            }

            // placement
            arr[j+1] = curr;
        }
        // printArray(arr);

        // marge sort ==> based on devied and conqure

        
    }
    
}
