import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchoolAppropriateWordsTest {
    SchoolAppropriateWords h;

    @Before
    public void setUp() throws Exception {
        h = new SchoolAppropriateWords();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("I love everyone :)", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(2, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(0, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, h.getPrice());
    }
}
