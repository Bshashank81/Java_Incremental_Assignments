public class OuterClass
{
    class InnerClass1
    {
        String value;
        InnerClass1(String innervalue)
        {
            value = innervalue;
            System.out.println("You are in "+innervalue);
        }
        void display()
        {
            System.out.println("The value is "+value);
        }
    }
}

