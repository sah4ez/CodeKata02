package com.github.sah4ez.kata02;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestData {
    RecursionBinarySearch recursionBinarySearch = new RecursionBinarySearch();
    ClassicBinarySearch classicBinarySearch = new ClassicBinarySearch();
    FunctionalStyleBinarySearch functionalStyleBinarySearch = new FunctionalStyleBinarySearch();

    @Test
    public void testChopClassic() throws Exception {
        Instant start = Instant.now();
        new DataGenerator().forEach(this::assertClassicBS);
        System.out.println("Classic: " + Duration.between(start, Instant.now()));
    }

    @Test
    public void testChopRecursive() throws Exception {
        Instant start = Instant.now();
        new DataGenerator().forEach(this::assertRecursiveBS);
        System.out.println("Recursive: " + Duration.between(start, Instant.now()));
    }

    @Test
    public void testFunctionStyleChop() throws Exception {
        Instant start = Instant.now();
        new DataGenerator().forEach(this::assertFunctionStyleBS);
        System.out.println("Function: " + Duration.between(start, Instant.now()));
    }

    private void assertRecursiveBS(TestPair testPair) {
        assertEquals(getMessage(testPair),
                testPair.getResult(), recursionBinarySearch.find(testPair.getSearch(), testPair.getArray()));
    }

    private void assertClassicBS(TestPair testPair) {
        assertEquals(getMessage(testPair),
                testPair.getResult(), classicBinarySearch.find(testPair.getSearch(), testPair.getArray()));
    }

    private void assertFunctionStyleBS(TestPair testPair) {
        assertEquals(getMessage(testPair),
                testPair.getResult(), functionalStyleBinarySearch.find(testPair.getSearch(), testPair.getArray()));
    }

    private String getMessage(TestPair testPair) {
        return "Expected index " + testPair.getResult() +
                " for number " +
                testPair.getSearch() +
                " in array " +
                Arrays.toString(testPair.getArray());
    }
}

