package levelp.androidapp;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSum() throws Exception {
        assertEquals("6", Calc.sum("1", "5"));
        Random gen = new Random();
        for (int i = 0; i < 20; i++) {
            long a = gen.nextInt(100);
            long b = gen.nextInt(100);
            assertEquals(Long.toString(a + b), Calc.sum("" + a, "" + b));
        }
        assertEquals("Введите первое число", Calc.sum("", "5"));
        assertEquals("a - не число", Calc.sum("a", "5"));
        assertEquals("Test - не число", Calc.sum("66", "Test"));
    }

    @Test
    public void testFailed() throws Exception {
        assertEquals(5, 2 + 2);
    }
}