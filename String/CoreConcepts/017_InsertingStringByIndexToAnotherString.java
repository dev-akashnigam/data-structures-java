package String.CoreConcepts;

class AddingStringByIndexToAnotherString {
    public static void main(String args[]) {
        String str = "Although it was raining, they continued the game";
        System.out.printf("Original String = %s", str);

        StringBuilder sbr = new StringBuilder(str);

        String insertionText = "paining and ";
        int insertionIndex = 16;

        sbr.insert(insertionIndex, insertionText);

        System.out.printf("After inserting string: \"%s\" at index: %d, string = \"%s\"\n", insertionText, insertionIndex, sbr);
    }
}