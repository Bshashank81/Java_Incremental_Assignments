import org.w3c.dom.Node;

public class SingleLinkedListNode<E>
{
    E data;
    SingleLinkedListNode<E> next;


    // Constructor
    public SingleLinkedListNode(E e)
    {
        this.data = e;
        this.next = null;
    }
}

