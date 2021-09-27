import org.junit.*;

import static org.junit.Assert.*;

public class RatTest {
    Rat r;

    @Before
    public void setUp() throws Exception {
        r = new Rat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Squerk", r.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        r.upgradeSpeed();
        assertEquals(2, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        r.downgradeSpeed();
        assertEquals(0, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(69, r.getPrice());
    }
}
