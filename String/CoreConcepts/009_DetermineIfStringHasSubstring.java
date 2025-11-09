package String.CoreConcepts;

class DetermineIfStringHasSubstring {
    public static void main(String[] args) {
        String str = "When the rain stopped, the city lights looked brighter than ever";
        System.out.printf("Original String = %s\n", str);

        String subs = "brighter";

        boolean hasCheck = str.contains(subs);

        System.out.printf("String: \"%s\" has substring: \"%s\" = %b\n", str, subs, hasCheck);
    }        
}
