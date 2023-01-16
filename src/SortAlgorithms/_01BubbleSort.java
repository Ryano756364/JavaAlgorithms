package SortAlgorithms;

public class _01BubbleSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnosrtedIndex = intArray.length - 1; lastUnosrtedIndex > 0; lastUnosrtedIndex--){
            for (int i = 0; i < lastUnosrtedIndex; i++) {
                if (intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
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
