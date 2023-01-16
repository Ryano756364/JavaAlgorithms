package SortAlgorithms;

public class _03InsertionSort {
    // Starts out by saying element in position 0 is in the sorted position
    // firstUnsortedIndex set to 1
    // sorted partition grows by one
    // newElement is firstUnsortedIndex
    // in-place algorithm

    // no swap method is needed
    // outer loop grows the sorted position by 1
        // inner loop is what does the sorting and shifting
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        // we do not start at 0 because implementation assume position 0 is already sorted
        for (int firstUnosrtedIndex = 1; firstUnosrtedIndex < arr.length; firstUnosrtedIndex++){

            int newElement = arr[firstUnosrtedIndex];

            // we need this i outside the loop to reset to 0;
            int i;

            //loop of sorted partition and looks for position to insert the correct element
            //start out with i because first element we want to insert is at element of firstUnsortedIndex

            // i > 0 (we want to look for position as long as we haven't hit the front of the array) ...
            // arr[i - 1] > newElement  (or the moment we have found an element that is less than the newElement) ...
            // ...then we have found the correct insertion position
            // i-- (remember we are decrementing i because we are checking sorted positions of array)
            for( i = firstUnosrtedIndex; i > 0 && arr[i - 1] > newElement; i--){
                // okay so we are not at zero, and we have found an element less than newElement
                arr[i] = arr[i -1];  //now we are going to shift from left to right
            }

            // okay so we've found correct position from the i in the loop being set to this position
            arr[i] = newElement;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
