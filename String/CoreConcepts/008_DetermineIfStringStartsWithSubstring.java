package String.CoreConcepts;

class DetermineIfStringStartsWithSubstring {
    public static void main(String[] args) {
        String str = "This story is about a person called Akash Nigam.";

        String subs = "This";

        boolean checkStart = str.startsWith(subs);

        System.out.printf("String: \"%s\" starts with substring: \"%s\" is = %b", str, subs, checkStart);
    }    
}
