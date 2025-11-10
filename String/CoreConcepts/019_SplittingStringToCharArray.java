package String.CoreConcepts;

import java.util.Arrays;

class SplittingStringToCharArray {
    public static void main(String[] args) {
        String str = "The sun is bright";
        System.out.printf("Original String = %s\n", str);

        char[] splittedStringCharArray = str.toCharArray();
        System.out.printf("Char array = %s\n", Arrays.toString(splittedStringCharArray));
    }
}
