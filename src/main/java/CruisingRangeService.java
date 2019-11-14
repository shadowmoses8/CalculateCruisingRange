public class CruisingRangeService {
    public int cruisingRange(int remainingFuelInMilliliters, int fuelConsumptionPer100KmInMilliliters) {
        if (fuelConsumptionPer100KmInMilliliters <= 0) {
            return 0;
        }
        if (remainingFuelInMilliliters < 0) {
            return 0;
        }
        return remainingFuelInMilliliters * 100 / fuelConsumptionPer100KmInMilliliters;
    }
}
