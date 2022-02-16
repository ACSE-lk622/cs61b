package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 11);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 121", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple1() {
        IntList lst = IntList.of(10, 13, 12, 222, 3);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("10 -> 169 -> 12 -> 222 -> 3", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(20, 15, 14, 122, 11);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("20 -> 15 -> 14 -> 122 -> 121", lst.toString());
        assertTrue(changed);
    }

}
