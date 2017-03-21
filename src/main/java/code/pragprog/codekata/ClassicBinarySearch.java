package code.pragprog.codekata;

/**
 * Created by sah4ez on 20.03.2017.
 */
public class ClassicBinarySearch {
    public int find(int i, int[] array1) {
        int length = array1.length;
        int result = -1;

        if (length == 1 && array1[0] == i) {
            result = 0;
        }

        for (int j = 0; j <= length; ) {
            if (length <= 1) break;
            int first = j + (length - j) / 2;

            int median = array1[first];

            if (median <= i) {
                j = first;
            } else {
                length = length / 2;
            }

            if (array1[j] == i) {
                result = j;
                break;
            } else if ((length - 1) - j == 1) {
                int last = length - 1;
                result = array1[last] == i ? last : -1;
                break;
            }
        }
        return result;
    }
}
