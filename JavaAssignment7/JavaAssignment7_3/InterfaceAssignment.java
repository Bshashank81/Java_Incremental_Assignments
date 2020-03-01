
class Execute extends ConcreteClass implements D
{
    public void a1(){}
    public void a2(){}
    public void b1(){}
    public void b2(){}
    public void c1(){}
    public void c2(){}
    public void d()
    {
        System.out.println("method of d interface");
    }
    void method1(A a)
    {
        System.out.println("Method of A");
    }
    void method2(B b)
    {
        System.out.println("Method of B");
    }
    void method3(C c)
    {
        System.out.println("Method of C");
    }
    void method4(D d)
    {
        System.out.println("Method of D");
    }
    public static void main(String args[])
    {
        Execute exec = new Execute();
        A a = new Execute();
        B b = new Execute();
        C c = new Execute();
        D d = new Execute();
        exec.method1(a);
        exec.method2(b);
        exec.method3(c);
        exec.method4(d);
    }
}
