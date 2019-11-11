import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CruisingRangeTest {

    @Test
    void calculateCruisingRange() {
        CruisingRange range = new CruisingRange();
        assertEquals(300, range.cruisingRange(30, 10));
    }

    @Test
    void calculateCruisingRangeAttNull() {
        CruisingRange range = new CruisingRange();
        assertEquals(0, range.cruisingRange(0, 0));
    }
}