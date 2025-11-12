package String.CoreConcepts;

class ReverseString {
    public static void main(String args[]) {
        String str = "Please review documents";
        System.out.printf("Original String = %s%n", str);

        String reversedString = new StringBuffer(str).reverse().toString();

        System.out.printf("Reversed String = %s%n", reversedString);
    }
}