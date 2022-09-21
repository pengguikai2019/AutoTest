package testng;

import org.huawei.Factorial;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testFact() {
        assertEquals(1, new Factorial().fact(1));
    }
}
