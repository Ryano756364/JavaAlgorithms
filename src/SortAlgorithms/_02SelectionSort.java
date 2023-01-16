package SortAlgorithms;

public class _02SelectionSort {
    // In-place algorithm
    // Doesn't require as much swapping as Bubble Sort (USUALLY performs better)
    // is an unstable algorithm (Bubble Sort is a stable algorithm)

    public static void main(String[] args){

        int[] arr = {20, 35, -15, 7, 55, 1, 22};

        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }

            swap(arr, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if (i == j){  // no need to swap these two since they are equal
            return;
        }

        int temp = array[i];
        array[i] = array[j];  // j moves down one
        array[j] = temp;  // i moves up one
    }
}
