package String.CoreConcepts;

import java.util.Arrays;

class JoiningArrayOfCharsToString {
   public static void main(String[] args) {
        char[] charArray = {'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D'};
        System.out.printf("Char Array = %s\n", Arrays.toString(charArray));

        String joinedStr = new String(charArray);
        System.out.printf("Joined string = %s\n", joinedStr);
   } 
}
