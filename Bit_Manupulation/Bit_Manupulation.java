package Bit_Manupulation;

public class Bit_Manupulation {

    // Get the 3rd bit position 2 of a number n. n= 0101
    // Process ==> 
    // perform bit mask : 1 << i
    // AND operation

    // binary operation
    // 8-4-2-1 
    // 5 ==> 0101
    // 1 =>0001 ==> 0100

    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;
        if((n & bitMask)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
        
    }
    
}
