package Array.CoreConcepts;

import java.util.Arrays;

class Clearing_Or_Removing_All_Array_Elements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.printf("Original Array, arr = %s\n", Arrays.toString(arr));

        // Since in Java, arrays are fixed-size, you cannot delete elements of the array. 
        //The best approach to clear the array, is to re-assign the array reference to an empty array. 
        arr = new int[]{};  // equivalent to arr = int int[0];
        System.out.printf("After clearing array, arr = %s\n", Arrays.toString(arr));
    }    
}
