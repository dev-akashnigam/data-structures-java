package Array.CoreConcepts;

import java.util.Arrays;

class Updating_Element_Of_Array_By_Index {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array, arr = "+ Arrays.toString(arr));

        arr[0] = 100;
        System.out.println("Array after updating the first array element with value: 100, arr = "+ Arrays.toString(arr));

        arr[arr.length-1] = 500;
        System.out.println("Array after updating the last array element with value: 500, arr = "+ Arrays.toString(arr));

        arr[2] = 300;
        System.out.println("Array after updating the array element at index: 2 with value: 300, arr = "+ Arrays.toString(arr));
    }   
}
