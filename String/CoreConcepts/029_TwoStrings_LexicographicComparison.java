/*
Lexicographic comparison is how strings (or sequences of characters) are compared based on dictionary order — i.e., 
the same way words are ordered in a dictionary.

So when strings like "apple" and "banana" are compared lexicographically,
the characters of both strings are compared one by one, using their Unicode (ASCII) values to decide which comes first.
*/

package String.CoreConcepts;

class TwoStrings_LexicographicComparison {
    public static void main(String[] args) {
        String str1 = "apple";
        System.out.printf("First String = %s%n", str1);

        String str2 = "banana";
        System.out.printf("Second String = %s%n", str2);

        int result = str1.compareTo(str2);

        if(result<0) {
            System.out.printf("%s < %s%n", str1, str2);
        } else if(result > 0) {
            System.out.printf("%s > %s%n", str1, str2);
        } else {
            System.out.printf("%s = %s%n", str1, str2);
        }
    }
}
