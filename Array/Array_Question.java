package Array;

public class Array_Question {
    public static boolean validMountainArray(int[] arr) {
        boolean res = true;
        boolean isIncrease = true;
        boolean isDecrease = true;
        boolean isvoilation = true;
        
      
        for(int i=0; i<arr.length -1;i++){
            if(arr[i]>arr[i+1]){
                if(isDecrease){
                    isvoilation = true;
                }
                isIncrease = true;
            }else{
                if(isIncrease){
                    isDecrease = true;

                }else{
                    isvoilation = true;

                }
            }

            
        }

        // System.out.println(desc);
        // System.out.println(count);
        return isvoilation;
        
    }
    public static void main(String[] args) {
        System.out.println("done");
        int[] arr = {2,3,4,3,2,5};
        boolean x=validMountainArray(arr);
        System.out.println(x);
        
    }
}
