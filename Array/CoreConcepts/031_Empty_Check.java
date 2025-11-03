package Array.CoreConcepts;

import java.util.Arrays;

class Empty_Check {
    public static void main(String[] args) {
        int[] arr = {};

        boolean isEmpty = arr.length==0;
        System.out.printf("Array arr = %s, is empty = %b", Arrays.toString(arr), isEmpty);
    }    
}
