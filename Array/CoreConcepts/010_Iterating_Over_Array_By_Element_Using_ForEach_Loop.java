package Array.CoreConcepts;

class Iterating_Over_Array_By_Element_Using_ForEach_Loop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for(int element : arr) {
            System.out.printf("Element = %d\n", element);
        }
    }
}
