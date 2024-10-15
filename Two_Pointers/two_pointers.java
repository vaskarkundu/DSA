package Two_Pointers;

import java.util.ArrayList;

public class two_pointers {

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int ini = 0;
        int res = 0;
        while (ini<arr1.length) {
            boolean x = true;
            int val = arr1[ini];
            for(int i =0; i<arr2.length; i++){
                if(!(Math.abs(val - arr2[i]) > d)){
                    x = false;
                    break;
                }
            }
            if(x){
              
                res++;
            }
            ini++;
            
        }
        return res;
    }


    public static void main(String[] args) {
        // arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
        int[] x= {1,4,2,3};
        int[] y= {-4,-3,6,10,20,30};
        int d = findTheDistanceValue(x, y, 3);

        
    }
    
}
