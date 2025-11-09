package String.CoreConcepts;

class DetermineFirstNLastIndexOfSubstring {
    public static void main(String[] args) {
        String str = "They laughed and laughed until they cried";
        System.out.printf("Original String = %s\n", str);

        String subs = "laughed";

        boolean hasCheck = str.contains(subs);
        System.out.printf("String: \"%s\" has substring: \"%s\" = %b\n", str, subs, hasCheck);

        if(hasCheck) {
            int firstIndex = str.indexOf(subs);
            int lastIndex = str.lastIndexOf(subs);

            System.out.printf("First index of substring: \"%s\" = %d\n", subs, firstIndex);
            System.out.printf("Last index of substring: \"%s\" = %d\n", subs, lastIndex);
        }
    }    
}
