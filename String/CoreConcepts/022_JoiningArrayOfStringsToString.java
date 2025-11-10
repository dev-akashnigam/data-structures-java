package String.CoreConcepts;

import java.util.Arrays;

class JoiningArrayOfStringsToString {
    public static void main(String[] args) {
        String[] stringArr = {"You", "look", "nice"};
        System.out.printf("Original String Array = %s\n", Arrays.toString(stringArr));

        String joinedStr = String.join(" ", stringArr);
        System.out.printf("Joined string = %s\n", joinedStr);
    }
}
