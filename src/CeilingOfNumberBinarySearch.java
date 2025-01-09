// given array, find smallest  number >= target number
public class CeilingOfNumberBinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,18};
        System.out.println("findFloorSolution(arr,15) = " + findFloorSolution(arr,15));
    }

    static int findFloorSolution(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        if (arr[startIndex] > arr[endIndex]) {
            return findCeilingSolutionDecreasingArray(arr, target);
        } else if (arr[startIndex] < arr[endIndex]) {
            return findCeilingSolutionIncreasingArray(arr, target);
        } else if (target <= arr[startIndex]) {
            return arr[startIndex];
        } else
            return -1;
    }

    private static int findCeilingSolutionIncreasingArray(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int returnVal = -1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + ((endIndex - startIndex) / 2);
            if (arr[middleIndex] < target) {
                startIndex = middleIndex + 1;
            } else if (arr[middleIndex] > target) {
                returnVal = arr[startIndex];
                endIndex = middleIndex - 1;
            } else {
                return arr[startIndex];
            }
        }
        return returnVal;
    }

    private static int findCeilingSolutionDecreasingArray(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int returnVal = -1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + ((endIndex - startIndex) / 2);
            if (arr[middleIndex] < target) {
                startIndex = middleIndex + 1;
            } else if (arr[middleIndex] > target) {
                returnVal = arr[middleIndex];
                endIndex = middleIndex - 1;
            } else {
                return arr[middleIndex];
            }
        }
        return returnVal;
    }
}
