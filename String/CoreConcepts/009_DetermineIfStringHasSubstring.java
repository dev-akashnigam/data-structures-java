package String.CoreConcepts;

class DetermineIfStringHasSubstring {
    public static void main(String[] args) {
        String str = "Hey boys, I am singing a song. Soup song. Flop song. Why this kolaveri kolaveri kolaveri d";
        System.out.printf("Original String = %s\n", str);

        String subs = "Flop";

        boolean hasCheck = str.contains(subs);

        System.out.printf("String: \"%s\" has substring: \"%s\" = %b\n", str, subs, hasCheck);
    }        
}
