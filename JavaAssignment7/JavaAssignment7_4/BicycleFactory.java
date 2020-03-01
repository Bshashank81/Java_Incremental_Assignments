public class BicycleFactory
{
    void buildingBicycle()
    {
        Bicycle bc = new Bicycle();
        bc.buildCycle();
    }
    public static void main(String args[])
    {
        BicycleFactory bcf = new BicycleFactory();
        bcf.buildingBicycle();
    }
}
