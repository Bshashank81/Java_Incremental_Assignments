
class Cycle
{
    void print()
    {
        System.out.println("Its a cycle");
    }
}

class Unicycle extends Cycle
{
    void balance()
    {
        System.out.println("Balance method in Unicycle");
    }
}

class Bicycle extends Cycle
{
    void balance()
    {
        System.out.println("Balance method in bicycle");
    }
}

class Tricycle extends Cycle
{

}

class TestCycle
{
    public static void main(String args[])
    {
        Unicycle unic = new Unicycle();
        Bicycle bic = new Bicycle();
        Tricycle tric = new Tricycle();

        //upcasting of subclasses to the superclasses
        Cycle[] cyc = new Cycle[3];
        cyc[0] =(Cycle) unic;
        cyc[1] =(Cycle) bic;
        cyc[2] =(Cycle) tric;

        //As method balance() is not available in cycle,
        // the following access of balance() in Unicycle,Bicycle
        // and Tricycle gives error. However, Tricycle which
        // do not contain balance also results in error
        cyc[0].balance();
        cyc[1].balance();
        cyc[2].balance();

        //downcasting of subclasses to the superclasses
        Cycle downCyc1 = new Unicycle();
        Cycle downCyc2 = new Bicycle();
        Cycle downCyc3 = new Tricycle();

        Unicycle downUnic = (Unicycle) downCyc1;
        Bicycle downBic = (Bicycle) downCyc2;
        Tricycle downTric = (Tricycle) downCyc3;

        downUnic.balance();
        downBic.balance();
        downTric.balance(); //Tricycle don't contain balance so it gives error


    }
}

