public class BinarySearchBasic {

    public static void main(String[] args) {
        int[] arr = {-123,-55,-2,2,3,5,6,9,55,8333,95888};
        System.out.println("binarySearchIndex(arr,95888) = " + binarySearchIndex(arr,95888));
    }

    // assume sorted array
    static int binarySearchIndex(int[] array, int num) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (endIndex >= startIndex) {
            int middleIndex = startIndex + ((endIndex - startIndex) / 2); // avoid exceeding int limit on java

            if (num == array[middleIndex]) {
                return middleIndex;
            } else if (num < array[middleIndex]) {
                endIndex = middleIndex - 1;
            } else if (num > array[middleIndex]) {
                startIndex = middleIndex + 1;
            }
        }
        return -1;

    }
}
