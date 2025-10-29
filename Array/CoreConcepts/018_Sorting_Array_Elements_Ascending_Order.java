package Array.CoreConcepts;

import java.util.Arrays;

class Sorting_Array_Elements_Ascending_Order {
    public static void main(String[] args) {
        int[] arr = {30, 50, 40, 10, 20};
        System.out.println("Original Array, arr = "+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted Array in Ascending Order, arr = "+ Arrays.toString(arr));
    }    
}
