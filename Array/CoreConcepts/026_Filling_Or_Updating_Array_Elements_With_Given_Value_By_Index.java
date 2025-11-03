package Array.CoreConcepts;

import java.util.Arrays;

class Filling_Or_Updating_Array_Elements_With_Given_Value_By_Index {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Original array, arr = "+Arrays.toString(arr));

        int valueToUpdate = 0;

        Arrays.fill(arr, 0, 6, valueToUpdate);
        System.out.printf("After filling or updating all array elements from beginning to the 5th index by value: %d , arr = %s\n", valueToUpdate, Arrays.toString(arr));

        valueToUpdate = 1;

        Arrays.fill(arr, 6, arr.length, valueToUpdate);
        System.out.printf("After filling or updating all array elements from 6th index to the end by value: %d , arr = %s\n", valueToUpdate, Arrays.toString(arr));

        valueToUpdate = 2;

        Arrays.fill(arr, 3, 9, valueToUpdate);
        System.out.printf("After filling or updating all array elements from 3rd index to 8th index by value: %d , arr = %s\n", valueToUpdate, Arrays.toString(arr));

        valueToUpdate = 3;

        Arrays.fill(arr, 0, arr.length, valueToUpdate);
        System.out.printf("After filling or updating all array elements from th beginning to end by value: %d , arr = %s\n", valueToUpdate, Arrays.toString(arr));
    }    
}
