package String.CoreConcepts;

class RemovingStringByIndicesFromAnotherString {
    public static void main(String[] args) {
        String str = "We can watch a movie, or we can go out for dinner";
        System.out.printf("Original String = %s\n", str);

        int removeFromIndex = 12;
        int removeToIndex = 21;

        String strOnRemoval = str.substring(0, 12) + str.substring(21, str.length());
        System.out.printf("On removing substring from index: %d to index: %d, string = %s\n", removeFromIndex, removeToIndex, strOnRemoval);
    }    
}
