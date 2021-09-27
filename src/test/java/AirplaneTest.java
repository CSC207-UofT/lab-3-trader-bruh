import org.junit.*;

import static org.junit.Assert.*;

public class AirplaneTest {
    Airplane boeing;

    public void testGetMaxSpeed() { assertEquals(100, boeing.getMaxSpeed()); }

    public void testIncreaseMaxSpeed(){
        boeing.upgradeSpeed();
        assertEquals(110, boeing.getMaxSpeed());
    }

    public void testDecreaseMaxSpeed(){
        boeing.downgradeSpeed();
        assertEquals(90, boeing.getMaxSpeed());
    }

    public void testGetPrice(){ assertEquals(1000, boeing.getPrice()); }
}
