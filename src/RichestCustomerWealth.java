// given m,x,n integer grid accounts, where accounts[i][j] is amount of money ith customer has in jth bank, return wealth of richest customer

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {1,2,3},
                {7,8,9}
        };
        System.out.println("returnWealthiest(arr) = " + returnWealthiest(arr));

    }

    static int returnWealthiest(int[][] grid) {
        int maxWealthDetected = 0;
        for (int[] row : grid) {
            int count = 0;
            for (int moneyValue: row) {
                count = count + moneyValue;
            }
            if (count > maxWealthDetected) {
                maxWealthDetected = count;
            }
        }
        return maxWealthDetected;
    }
}
