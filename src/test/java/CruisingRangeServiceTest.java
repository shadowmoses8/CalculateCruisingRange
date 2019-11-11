import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CruisingRangeServiceTest {

    @Test
    void calculateCruisingRange() {
        CruisingRangeService range = new CruisingRangeService();
        assertEquals(300, range.cruisingRange(30, 10));
    }

    @Test
    void calculateCruisingRangeAttNull() {
        CruisingRangeService range = new CruisingRangeService();
        assertEquals(0, range.cruisingRange(10, 0));
    }

    @Test
    void calculateCruisingRangeLessThanZero() {
        CruisingRangeService range = new CruisingRangeService();
        assertEquals(0, range.cruisingRange(-10, 10));
    }
}