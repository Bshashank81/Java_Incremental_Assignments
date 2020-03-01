/**
2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
**/

public class OverloadedConstructor
{
    OverloadedConstructor(int a)
    {
        System.out.println("Value in constructor 1: "+a);
        OverloadedConstructor cb = new OverloadedConstructor("its 2nd constructor");
    }

    OverloadedConstructor(String b)
    {
        System.out.println("Value in constructor 2: "+b);
    }

    public static void main(String args[])
    {
        OverloadedConstructor olc = new OverloadedConstructor(10);
    }
}
