package String.CoreConcepts;

class RemoveWhitespacesFromString {
    public static void main(String[] args) {
        String str = "  The presentation outline has been finalized   and approved. ";
        System.out.printf("Original String = %s\n", str);

        str = str.trim();
        System.out.printf("String after trimming whitespaces = %s", str);
    }    
}
