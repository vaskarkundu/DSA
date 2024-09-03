package sorting;

public class Quick_sort {

    public static int partition(int[] arr, int l, int h){
        int pivot = arr[h];
        int i = l -1;

        for(int j = l; j<h; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int tem = arr[i];
        arr[i] = pivot;
        pivot = tem;

        return i;
    }
    
    public static void quick(int[] arr, int l, int h){
        if(l < h){
            int pvtIdx = partition(arr,l,h);
            quick(arr, l, pvtIdx-1);
            quick(arr, pvtIdx+1, h);
        }

    }

    public static void main(String[] args) {
        int [] arr = {1,4,3,6,8,2};
        quick(arr, 0, arr.length -1);

        for(int s : arr){

            System.out.println(s);
        }
    }
    
}
