package String.CoreConcepts;

class DetermineIfStringStartsWithSubstring {
    public static void main(String[] args) {
        String str = "The curious fox wandered through the misty valley at dawn";
        System.out.printf("Original String = %s\n", str);

        String subs = "The";

        boolean checkStart = str.startsWith(subs);

        System.out.printf("String: \"%s\" starts with substring: \"%s\" is = %b", str, subs, checkStart);
    }    
}
