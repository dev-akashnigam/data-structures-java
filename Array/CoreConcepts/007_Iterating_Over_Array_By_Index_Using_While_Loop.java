package Array.CoreConcepts;

class Iterating_Over_Array_By_Index_Using_While_Loop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int index = 0;
        while(index < arr.length) {
            System.out.printf("arr[%d] = %d\n", index, arr[index]);
            index++;
        }
    }
}
