package com.github.sah4ez.kata02;

/**
 * Created by aleksandr on 21.03.17.
 */
public class RecursionBinarySearch {
    public int find(int search, int[] array) {
        int length = array.length;
        int result = -1;

        if (length > 0){
            result = find(0, length - 1, search, array);
        }

        return result;
    }

    public int find(int first, int last, int search, int[] array) {
        int length = last - first;
        int result = -1;

        if (array[first] == search ) {
            return first;
        } else if (array[last] == search) {
            return last;
        } else if (length <= 1){
            return result;
        }

        int median = (first + last) / 2;

        if (array[median] <= search){
            first = median;
        }else {
            last = median;
        }

        result = find(first, last, search, array);

        return result;
    }

}
