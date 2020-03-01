public class TricycleFactory
{
    void buildingTricycle()
    {
        Tricycle tc = new Tricycle();
        tc.buildCycle();
    }
    public static void main(String args[])
    {
        TricycleFactory tcf = new TricycleFactory();
        tcf.buildingTricycle();
    }
}
