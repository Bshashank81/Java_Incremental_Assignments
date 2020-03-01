public class AnotherClass
{
    class InnerClass2 extends OuterClass.InnerClass1
    {
        InnerClass2(String innervalue)
        {

            new OuterClass().super(innervalue);
        }
    }
    public static void main(String args[])
    {
        AnotherClass.InnerClass2 in2 = new AnotherClass().new InnerClass2("innerClass2");
        in2.display();
    }
}