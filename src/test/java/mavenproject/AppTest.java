package mavenproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class TestClac

{
    @Test
    public void testAdd() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = Clac.add(a, b);
        Assertions.assertEquals(a + b, result);
    }
    @Test
    public void testSubtract() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = Clac.subtract(a, b);
        Assertions.assertEquals(a - b, result);
    }
}
