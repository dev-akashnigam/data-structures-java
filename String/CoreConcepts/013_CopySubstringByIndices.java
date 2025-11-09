package String.CoreConcepts;

class CopySubstringByIndices {
    public static void main(String[] args) {
        String str = "He accidentally joined a yoga class thinking it was a sandwich shop";
        System.out.printf("Original String = %s\n", str);

        int startIndexToCopy = 3;
        int endIndexToCopy = 11;

        String subs = str.substring(startIndexToCopy, endIndexToCopy);
        System.out.printf("Substring from index: %d to index: %d = %s\n", startIndexToCopy, endIndexToCopy, subs);
    }    
}
