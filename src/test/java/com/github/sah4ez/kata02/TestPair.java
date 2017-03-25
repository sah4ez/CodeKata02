package com.github.sah4ez.kata02;

/**
 * Created by aleksandr on 21.03.17.
 */
public class TestPair {
    private final int result;
    private final int[] array;
    private final int search;

    public TestPair(int[] array, int search, int result) {
        this.result = result;
        this.array = array;
        this.search = search;
    }

    public int[] getArray() {
        return array;
    }

    public int getResult() {
        return result;
    }

    public int getSearch() {
        return search;
    }
}
