package String.CoreConcepts;

class DetermineIfStringEndsWithSubstring {
    public static void main(String[] args) {
        String str = "A cup of coffee can turn an ordinary morning into something special";
        System.out.printf("Original String = %s\n", str);

        String subs = "special";

        boolean endCheck = str.endsWith(subs);

        System.out.printf("String: \"%s\" ends with substring: \"%s\" = %b\n", str, subs, endCheck);
    }    
}
