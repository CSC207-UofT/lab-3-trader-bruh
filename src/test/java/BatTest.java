import org.junit.*;

import static org.junit.Assert.*;

public class BatTest {
    Bat b;

    @Before
    public void setUp() throws Exception {
        b = new Bat();
    }

    @Test(timeout = 500)
    public void TestSound() {
        assertEquals("moo", b.sound());
    }

    @Test(timeout = 500)
    public void TestGetPrice() {
        assertEquals(500, b.getPrice());
    }
}