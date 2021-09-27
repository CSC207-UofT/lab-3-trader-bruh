import org.junit.*;

import static org.junit.Assert.*;

public class CatTest {
    Cat c;

    @Before
    public void setUp() throws Exception {
        c = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("https://www.youtube.com/watch?v=ngWYG3I_cTQ!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(2, c.getPrice());
    }
}
