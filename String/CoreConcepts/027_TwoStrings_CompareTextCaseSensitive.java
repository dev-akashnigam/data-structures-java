package String.CoreConcepts;

class TwoStrings_CompareTextCaseSensitive {
    public static void main(String[] args) {
        String str1 = "Life moves fast";
        System.out.printf("First String = %s%n", str1);

        String str2 = "Life moves fast";
        System.out.printf("Second String = %s%n", str2);

        boolean isTextSame = str1.equals(str2);

        if(isTextSame) {
            System.out.printf("Text of both strings are same.");
        } else {
            System.out.printf("Text of both strings are different.");
        }
    }    
}
