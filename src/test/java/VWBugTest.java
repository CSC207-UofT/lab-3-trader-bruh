import org.junit.*;

import static org.junit.Assert.*;

public class VWBugTest {
    VWBug bugDefault;
    VWBug bugCustom;

    @Before
    public void setUp() throws Exception {
       bugDefault = new VWBug();
       bugCustom = new VWBug("really dark blue", 1);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("beep beep", bugDefault.sound());
        assertEquals("beep beep", bugCustom.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1000, bugDefault.getMaxSpeed());
        assertEquals(1, bugCustom.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        bugCustom.upgradeSpeed();
        assertEquals(3, bugCustom.getMaxSpeed());

        bugDefault.upgradeSpeed();
        assertEquals(1002, bugDefault.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        bugCustom.downgradeSpeed();
        assertEquals(-1, bugCustom.getMaxSpeed());

        bugDefault.downgradeSpeed();
        assertEquals(998, bugDefault.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(-0, bugCustom.getPrice());
        assertEquals(-0, bugDefault.getPrice());
    }
}
