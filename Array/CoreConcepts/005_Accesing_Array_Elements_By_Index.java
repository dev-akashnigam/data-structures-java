package Array.CoreConcepts;

class Accesing_Array_Elements_By_Index {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int firstElement = arr[0];
        int forthElement = arr[3];
        int lastElement = arr[arr.length-1];

        System.out.printf("First element of array = %d\n", firstElement);
        System.out.printf("Forth element of array = %d\n", forthElement);
        System.out.printf("Last element of array = %d\n", lastElement);
    }    
}
