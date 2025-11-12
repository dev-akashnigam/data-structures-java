package String.CoreConcepts;

class TwoStrings_CompareTextCaseInsensitive {
    public static void main(String[] args) {
        String str1 = "Life moves fast";
        System.out.printf("First String = %s%n", str1);

        String str2 = "LIFE MOVES FAST";
        System.out.printf("Second String = %s%n", str2);

        boolean isTextSame = str1.equalsIgnoreCase(str2);

        if(isTextSame) {
            System.out.printf("Text of both strings are same.");
        } else {
            System.out.printf("Text of both strings are different.");
        } 
    }
}
