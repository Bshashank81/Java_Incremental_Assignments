public class SList<E>  {

    SingleLinkedListNode<E> head;
    int size;
    SList(){
        head=null;
        size=0;
    }
    public SListIterator<E> iterator()
    {
        return new SListIterator<E>();
    }
}

