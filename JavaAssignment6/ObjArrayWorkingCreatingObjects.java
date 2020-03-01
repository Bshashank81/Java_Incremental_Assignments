/**
4. Complete the previous exercise by creating objects to attach to the array of references.
**/

public class ObjArrayWorkingCreatingObjects
{
    public static void main(String args[])
    {
        ObjectArrayWorking[] objArray = new ObjectArrayWorking[5];
        ObjectArrayWorking obj1 = new ObjectArrayWorking("apple");
        objArray[0] = obj1;
        objArray[0].print();

        ObjectArrayWorking obj2 = new ObjectArrayWorking("pineapple");
        objArray[1] = obj2;
        objArray[1].print();

        ObjectArrayWorking obj3 = new ObjectArrayWorking("mango");
        objArray[2] = obj3;
        objArray[0].print();

        ObjectArrayWorking obj4 = new ObjectArrayWorking("orange");
        objArray[3] = obj4;
        objArray[3].print();

        ObjectArrayWorking obj5 = new ObjectArrayWorking("banana");
        objArray[4] = obj5;
        objArray[4].print();
    }
}
