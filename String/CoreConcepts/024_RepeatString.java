package String.CoreConcepts;

class RepeatString {
    public static void main(String[] args) {
        String str = "Meeting starts soon.";
        System.out.printf("Original String = %s\n", str);

        int repeatCount = 3;
        str = str.repeat(repeatCount);
        System.out.printf("After repeating string %d times, string = %s\n", repeatCount, str);
    }
}