package String.CoreConcepts;

import java.util.Arrays;

class SplittingStringToStringArray {
    public static void main(String[] args) {
        String str = "The sun is bright";
        System.out.printf("Original String = %s\n", str);

        String[] splittedStringArray = str.split("");
        System.out.printf("String array = %s\n", Arrays.toString(splittedStringArray));
    }
}