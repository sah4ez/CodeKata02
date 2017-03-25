package com.github.sah4ez.kata02;

/**
 * Created by sah4ez on 20.03.2017.
 */
public class ClassicBinarySearch {
    public int find(int search, int[] array1) {
        int length = array1.length;
        int result = -1;

        if (length == 1 && array1[0] == search) {
            result = 0;
        }

        for (int j = 0; j <= length; ) {
            if (length <= 1) break;
            int first = j + (length - j) / 2;

            int median = array1[first];

            if (median <= search) {
                j = first;
            } else {
                length = length / 2;
            }

            if (array1[j] == search) {
                result = j;
                break;
            } else if ((length - 1) - j == 1) {
                int last = length - 1;
                result = array1[last] == search ? last : -1;
                break;
            }
        }
        return result;
    }
}
