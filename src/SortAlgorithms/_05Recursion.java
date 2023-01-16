package SortAlgorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _05Recursion {

    public static void main(String[] args) {
        // A method is recursive if it calls itself in the method
        // Calculate a factorial in an iterative way...
        // 1! = 0! * 1 = 1
        // 2! = 2 * 1 = 2 * 1!
        // 3! = 3 * 2 * 1 = 3 * 2!
        // 4! = 4 * 3 * 2 * 1 = 4 * 3!

        // n! = n * (n - 1)!

    }

    public static int recursiveFactorial(int num) {

        if (num == 0){
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num){

        if (num == 0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }

        return factorial;
    }
}


