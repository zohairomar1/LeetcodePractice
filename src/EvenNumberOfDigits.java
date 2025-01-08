// Given array, nums, of integers, return the count of how many integers contain an even number of digits (i.e. list (2,95,888,0,6555) would return 2)

import java.util.ArrayList;

public class EvenNumberOfDigits {

    public static void main(String[] args) {

        int[] arr = {2,95,888,0,6555};

        System.out.println("findCount(arr) = " + findCount(arr));
    }

    static int findCount(int[] array) {

        // initialize counter
        int counter = 0;

        // for each integer
        for (int element: array) {


            // check if it is even in length
            if (isEven(getLength(element))) {
                counter++;
            }

        }
        return counter;

    }

    // helper
    static int getLength(int num) {
        int length = 1;

        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            length++;
            num = num/10;
        }
        return length;
    }

    // helper
    static boolean isEven(int length) {
        if (length % 2 == 0) {
            return true;
        }
        return false;
    }



}
