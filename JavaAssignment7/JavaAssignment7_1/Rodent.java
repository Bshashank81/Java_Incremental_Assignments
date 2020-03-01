abstract class Rodent
{
    Rodent()
    {
        System.out.println("In class Rodent");
    }
    abstract public void makeBurrows();
    {
        System.out.println("Original rodent method makeBurrows");
    }
    abstract public void biteThings();
    {
        System.out.println("Original rodent method biteThings");
    }
}

class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("In class Mouse");
    }

    @Override
    public void makeBurrows()
    {
        System.out.println("Mouse makes small Burrows");
    }

    @Override
    public void biteThings()
    {
        System.out.println("Mouse bite things");
    }
}

class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("In class Gerbil");
    }

    @Override
    public void makeBurrows()
    {
        System.out.println("Gerbil make Burrows");
    }

    @Override
    public void biteThings()
    {
        System.out.println("Gerbil bite things");
    }
}

class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("In class Hamster");
    }

    @Override
    public void makeBurrows()
    {
        System.out.println("Hamster make burrows");
    }

    @Override
    public void biteThings()
    {
        System.out.println("Hamster bite things");
    }
}

class TestRodent
{
    public static void main(String args[])
    {
        Rodent[] rdtArray = new Rodent[3];
        rdtArray[0] = new Mouse();
        rdtArray[0].makeBurrows();
        rdtArray[0].biteThings();
        System.out.println("\n");

        rdtArray[1] = new Gerbil();
        rdtArray[1].makeBurrows();
        rdtArray[1].biteThings();
        System.out.println("\n");

        rdtArray[2] = new Hamster();
        rdtArray[2].makeBurrows();
        rdtArray[2].biteThings();
    }
}
