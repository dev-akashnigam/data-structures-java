package Array.CoreConcepts;

import java.util.Arrays;

class Printing_Array_Elements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // using system.out.println()
        System.out.println("On printing using println() method, arr = "+ Arrays.toString(arr));

        // using system.out.printf()
        System.out.printf("On printing using printf() method, arr = %s", Arrays.toString(arr));
    }    
}
