public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        int[] array = {95,45,32,14,9,-2,-95};
        int[] array2 = {-123,-123,-2,2,3,5,6,9,55,8333,95888};
        System.out.println("descendingOrderBinarySearch(array,-2) = " + descendingOrderBinarySearch(array,-2));


        System.out.println("agnosticOrderBinarySearch(array,-2) = " + agnosticOrderBinarySearch(array,-2));
        System.out.println("agnosticOrderBinarySearch(array2,8333) = " + agnosticOrderBinarySearch(array2,8333));
    }
    
    static int descendingOrderBinarySearch(int[] arr, int num) {
        int startIndex = 0;
        int endIndex = arr.length;
        
        while (startIndex <= endIndex) {
            int middleIndex = startIndex + ((endIndex - startIndex) / 2);
            
            if (num == arr[middleIndex]) {
                return middleIndex;
            } else if (num < arr[middleIndex]) {
                startIndex = middleIndex + 1;
            } else if (num < arr[middleIndex]) {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    static int agnosticOrderBinarySearch(int[] arr, int num) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        if (arr[startIndex] > arr[endIndex]) {
            return descendingOrderBinarySearch(arr, num);
        } else {
            return BinarySearchBasic.binarySearchIndex(arr,num);
        }
    }
}
