package com.github.sah4ez.kata02;

import java.util.ArrayList;

/**
 * Created by aleksandr on 21.03.17.
 */
public class DataGenerator extends ArrayList<TestPair> {
    public DataGenerator() {
        add(new TestPair(new int[]{}, 3, -1));
        add(new TestPair(new int[]{1}, 3, -1));
        add(new TestPair(new int[]{3}, 3, 0));
        add(new TestPair(new int[]{1, 3}, 3, 1));
        add(new TestPair(new int[]{1, 2, 3}, 3, 2));
        add(new TestPair(new int[]{1, 2, 3, 4, 5},1,0));
        add(new TestPair(new int[]{1, 2, 3, 4, 5},2,1));
        add(new TestPair(new int[]{1, 2, 3, 4, 5},3,2));
        add(new TestPair(new int[]{1, 2, 3, 4, 5},4,3));
        add(new TestPair(new int[]{1, 2, 3, 4, 5},5,4));
        add(new TestPair(new int[]{1, 2, 3, 4, 5},6,-1));
        add(new TestPair(new int[]{1, 2, 3, 4, 5},0,-1));
        add(new TestPair(new int[]{1, 3, 4, 5},2,-1));
        add(new TestPair(new int[]{1, 3, 4, 5},3,1));
        add(new TestPair(new int[]{1, 2, 3, 5},4,-1));
        add(new TestPair(new int[]{1, 2, 4, 5},3,-1));
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }
        add(new TestPair(arr, 500, 500));
    }
}
