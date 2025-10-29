package Array.CoreConcepts;

import java.util.Arrays;

class Search_Array_Elements_By_Value {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50};

        int searchElement = 20;

        Arrays.sort(arr); // After sorting the array, you cannot determine the index of the searchElement.
        int searchResult = Arrays.binarySearch(arr, searchElement);

        if(searchResult>=0) {
            System.out.printf("Element: %d is PRESENT in the array.", searchElement);
            // There is no built-in method in Java that can help determine the index (first or last) of the search element.
        }
        else {
            System.out.printf("Element: %d is NOT PRESENT in the array.", searchElement);
        }
    }
}
