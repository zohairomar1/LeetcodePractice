import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
        int[][] arr = {
            {2,3,5},
            {9,1,4},
            {5,7,9},

        };
        System.out.println("Arrays.toString(searchForValue(arr,5)) = " + Arrays.toString(searchForValue(arr,5)));
    }

    static int[] searchForValue(int[][] arr, int val) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == val) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
