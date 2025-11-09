package String.CoreConcepts;

class ReplaceSubstring {
    public static void main(String[] args) {
        String str = "The mountain stood unmoved, watching centuries pass below";
        System.out.printf("Original String = %s\n", str);

        String substringToReplace = "watching";
        String newSubstring = "gazing";

        str = str.replace(substringToReplace, newSubstring);
        System.out.printf("On replacing the substring: \"%s\" with \"%s\" in the original string, the string becomes = \"%s\"\n", substringToReplace, newSubstring, str);
    }    
}
