package Array.CoreConcepts;

import java.util.Arrays;

class Copying_Array_Elements_By_Index {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Original array, arr = "+Arrays.toString(arr));

        int[] arrCopyFromBeginningTo5thIndex = Arrays.copyOfRange(arr, 0, 6);
        System.out.println("Copied array from beginning to 5th index, arrCopyFromBeginningTo5thIndex = "+Arrays.toString(arrCopyFromBeginningTo5thIndex));

        int[] arrCopyFrom5thIndexToEnd = Arrays.copyOfRange(arr, 5, arr.length);
        System.out.println("Copied array from 5th index to end, arrCopyFrom5thIndexToEnd = "+Arrays.toString(arrCopyFrom5thIndexToEnd));

        int[] arrCopyFrom3rdIndexTo8thIndex = Arrays.copyOfRange(arr, 3, 9);
        System.out.println("Copied array from 3rd index to 8th index, arrCopyFrom3rdIndexTo8thIndex = "+Arrays.toString(arrCopyFrom3rdIndexTo8thIndex));

        int[] fullCopyArr = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println("Full Copy of Array, fullCopyArr = "+Arrays.toString(fullCopyArr));
    }    
}
