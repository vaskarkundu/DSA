package sorting;

public class Sorting {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 

    public static void main(String[] args) {
       
        int arr[]={4,1,5,3,9,6};
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

        printArray(arr);

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

        printArray(arr);

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
        printArray(arr);

        
    }
    
}
