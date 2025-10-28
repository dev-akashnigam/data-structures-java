package Array.CoreConcepts;

class Iterating_Over_Array_By_Index_Using_For_Loop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for(int index=0; index<arr.length; index++) {
            System.out.printf("arr[%d] = %d\n", index, arr[index]);
        }
    }    
}
