package String.CoreConcepts;

class ConvertAllCharactersToUpperCase {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.printf("Original String = %s\n", str);

        String upperCaseConvertedString = str.toUpperCase();
        System.out.printf("After converting string to uppercase = %s\n", upperCaseConvertedString);
    }    
}
