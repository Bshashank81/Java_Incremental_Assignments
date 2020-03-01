/**
3. Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.
**/

public class ObjectArrayWorking
{
    ObjectArrayWorking(String word)
    {
        System.out.print(word+"\t");
    }

    void print()
    {
        System.out.print("fruit\n");
    }

    public static void main(String args[])
    {
        ObjectArrayWorking[] OCObjArray=new ObjectArrayWorking[5];
        for(int i=0;i<5;i++)
        {
            OCObjArray[i] = new ObjectArrayWorking("cool");
        }
    }
}
