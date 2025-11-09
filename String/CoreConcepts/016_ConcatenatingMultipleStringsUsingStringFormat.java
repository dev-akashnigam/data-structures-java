package String.CoreConcepts;

class ConcatenatingMultipleStringsUsingStringFormat {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.printf("First string = %s\n", str1);

        String str2 = "Beautiful";
        System.out.printf("Second string = %s\n", str2);

        String str3 = "World";
        System.out.printf("Third string = %s\n", str3);

        String concatenatedString = String.format("%s%s%s",str1, str2, str3);
        System.out.printf("Concatenated string = %s\n", concatenatedString);
    }    
}
