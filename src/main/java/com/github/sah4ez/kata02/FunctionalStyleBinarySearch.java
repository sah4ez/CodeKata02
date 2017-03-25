package com.github.sah4ez.kata02;

import java.util.function.Function;

/**
 * Created by aleksandr on 25.03.17.
 */
public class FunctionalStyleBinarySearch {
    int first = 0;
    int last = 0;
    int median = -1;

    public int find(int search, int[] array) {
        first = 0;
        median = -1;
        last = array.length - 1;
        if (last == -1) {
            return median;
        }
        if (array[first] == search ) {
            return first;
        } else if (array[last] == search) {
            return last;
        } else if (array.length <= 1){
            return -1;
        }

        Function<int[], int[]> split = (int[] s) -> {
            median = first + (last - median) / 2;
            Integer value = s[median];
            if (value <= search) {
                first = median;
            } else {
                last = median - 1;
            }
            return s;
        };

        split.apply(array);

        while (first < last-1) {
            split.apply(array);
        }

        if (array[first] == search){
            return first;
        }else if (array[last] == search) {
            return last;
        }else {
            return -1;
        }
    }
}

