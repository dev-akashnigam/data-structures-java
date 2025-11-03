package Array.CoreConcepts;

import java.util.Arrays;

class Searching_Array_By_Value {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 20, 40};
        System.out.println("Original Array, arr = "+Arrays.toString(arr));

        int searchElement = 20;

        Arrays.sort(arr);
        int searchResult = Arrays.binarySearch(arr, searchElement);

        if(searchResult>=0) {
            System.out.printf("Element: %d is present in the array.", searchElement);

            // there exists no built-in method for determining the index (first or last) of the searched element in the array.
        }
        else {
            System.out.printf("Element: %d is NOT present in the array.", searchElement);
        }
    }
}