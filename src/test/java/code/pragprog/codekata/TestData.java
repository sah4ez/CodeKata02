package code.pragprog.codekata;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestData {
    @Test
    public void testChopClassic() throws Exception {
        new DataGenerator().forEach(this::assertClassicBS);
    }

    @Test
    public void testChopRecursive() throws Exception{
        new DataGenerator().forEach(this::assertRecursiveBS);
    }

    private void assertRecursiveBS(TestPair testPair) {
        RecursionBinarySearch recursionBinarySearch = new RecursionBinarySearch();
        assertEquals(getMessage(testPair),
                testPair.getResult(), recursionBinarySearch.find(testPair.getSearch(), testPair.getArray()));
    }

    private void assertClassicBS(TestPair testPair) {
        ClassicBinarySearch classicBinarySearch = new ClassicBinarySearch();
        assertEquals(getMessage(testPair),
                testPair.getResult(), classicBinarySearch.find(testPair.getSearch(), testPair.getArray()));
    }

    private String getMessage(TestPair testPair){
        return "Expected index " + testPair.getResult() +
                " for number " +
                testPair.getSearch() +
                " in array " +
                Arrays.toString(testPair.getArray());
    }
}

