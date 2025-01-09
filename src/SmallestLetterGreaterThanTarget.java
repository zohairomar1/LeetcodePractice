// given array of characters in increasing order, find smallest letter that is bigger than target

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] list = {'c','f','j'};
        System.out.println("findSmallestLetterGreaterThanTarget(list,'a') = " + findSmallestLetterGreaterThanTarget(list,'a'));
    }

    static char findSmallestLetterGreaterThanTarget(char[] letters, char target) {
        int startIndex = 0;
        int endIndex = letters.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + ((endIndex-startIndex)/2);

            if (letters[middleIndex] > target) {
                endIndex = middleIndex - 1;
            } else if (letters[middleIndex] < target) {
                startIndex = middleIndex + 1;
            } else {
                return letters[middleIndex];
            }
            
        }
        return letters[startIndex];
    }
}
