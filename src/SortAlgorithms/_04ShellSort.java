package SortAlgorithms;

public class _04ShellSort {

    public static void main(String[] args){
        //This strategy optimizes Insertion Sort
        //uses a gap to get a head start on sorting the array and then implements the insertion sort

        int[] intArray = {20, 35, 15, 7, 55, 1, -22};

        // first loops initializes gap value and then reduce it on each iteration, gap of 1 for final iteration -> then send to shell sort
        for(int gap = intArray.length / 2; gap > 0; gap = gap / 2){

            // now we will essentially use Insertion Sort
            for (int i = gap; i <  intArray.length; i++){

                int newElement = intArray[i]; // first value we are going to be looking at

                int j = i;  // now we use J to do the traversing

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];    // now we want to shift at intArray j - gap up gap positions
                    j = j - gap;
                }

                intArray[j] = newElement;
            }
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
