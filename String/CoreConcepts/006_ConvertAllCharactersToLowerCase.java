package String.CoreConcepts;

class ConvertAllCharactersToLowerCase {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.printf("Original String = %s\n", str);

        String lowerCaseConvertedString = str.toLowerCase();
        System.out.printf("After converting string to lowercase = %s\n", lowerCaseConvertedString);
    }
}
