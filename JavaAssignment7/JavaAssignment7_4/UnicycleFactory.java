public class UnicycleFactory
{
    void buildingUnicycle()
    {
        Unicycle uc = new Unicycle();
        uc.buildCycle();
    }
    public static void main(String args[])
    {
        UnicycleFactory ucf = new UnicycleFactory();
        ucf.buildingUnicycle();
    }
}
