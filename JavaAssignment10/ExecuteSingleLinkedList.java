import java.util.Scanner;

public class ExecuteSingleLinkedList
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        SList<String> myList=new SList<String>();

        SListIterator<String> iterator=myList.iterator();

        System.out.println("Enter your choice:");
        int choice;

        while(true)
        {
            System.out.println("Single Linked List Menu");
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
            System.out.println("Enter your choice(1-4)");

            choice = scanner.nextInt();

            switch (choice)
            {
                case 1: System.out.print("Enter the element to add");
                        String value=scanner.next();
                        iterator.insert(value);
                        break;
                case 2: iterator.remove();
                        break;
                case 3: System.out.println("The elements present in the single linked list are:");
                        while (iterator.hasNext())
                        {
                            System.out.print(iterator.next() + " ");
                        }
                        System.out.println();
                        iterator.setCurrentNode();
                        break;
                case 4: System.exit(0);
                default : System.out.println("Wrong Choice, choose another option!");
            }
        }
    }
}

