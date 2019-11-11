public class CruisingRange {
    public int cruisingRange(int remainingFuelInMilliliters, int fuelConsumptionPer100KmInMilliliters) {
        if (fuelConsumptionPer100KmInMilliliters <= 0) {
            return 0;
        } else if (remainingFuelInMilliliters < 0) {
            return 0;
        } else {
            return remainingFuelInMilliliters * 100 / fuelConsumptionPer100KmInMilliliters;
        }
    }
}
