public class SListIterator<E>
{

    SList singleLinkedList;
    SingleLinkedListNode<E> currentNode;


    public SListIterator()
    {
        singleLinkedList = new SList();
        singleLinkedList.size = 0;
        singleLinkedList.head = null;
        currentNode = null;
    }

    public void setCurrentNode()
    {
        currentNode = singleLinkedList.head;
    }

    public boolean hasNext()
    {
        return currentNode != null;
    }

    public E next()
    {
        E data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }

    public void insert(E data)
    {
        SingleLinkedListNode<E> newNode = new SingleLinkedListNode<E>(data);
        SingleLinkedListNode<E> temp = currentNode;
        if (currentNode == null)
        {
            currentNode = newNode;
            singleLinkedList.head = currentNode;
        }
        else
        {
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
        singleLinkedList.size++;
    }


    public void remove()
    {
        E elementRemoved;
        if (singleLinkedList.size > 1)
        {
            SingleLinkedListNode<E> secondLast = currentNode;
            while (secondLast.next != null && secondLast.next.next != null)
            {
                secondLast = secondLast.next;
            }
            elementRemoved = secondLast.next.data;
            System.out.println(elementRemoved+" is removed");
            secondLast.next = null;
            singleLinkedList.size--;

        }
        else if (singleLinkedList.size == 1)
        {
            elementRemoved = currentNode.data;
            currentNode = null;
            System.out.println(elementRemoved+" is removed");
            singleLinkedList.size--;
        }
        else if (singleLinkedList.size == 0)
        {
            System.out.println("List is empty, element cannot be removed from empty list");
        }
    }
}

