package String.CoreConcepts;

class ReadingCharacterByIndex {
    public static void main(String[] args) {
        String str = "Hello World";

        char firstChar = str.charAt(0);
        System.out.printf("First character in string: %s = %c\n", str, firstChar);

        char fifthChar = str.charAt(4);
        System.out.printf("Fifth character in string: %s = %c\n", str, fifthChar);

        char lastChar = str.charAt(str.length()-1);
        System.out.printf("Last character in string: %s = %c\n", str, lastChar);
    }
}
