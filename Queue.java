public class Queue<T> {

    Element head;
    Element tail;
    private int size;



    // add element
    public void enqueue(T value){
        Element element = new Element(value);
        if (head == null){
            head = element;
            tail = element;
        }else{
            tail.next = element;
            tail = element;
        }
        size++;
    }

    // delete element
    public void dequeue() throws EmptyQueueException{
        if (head == null){
            throw new EmptyQueueException("Queue is empty");
        }else{
            head = head.next;
            size--;
        }
    }

    // size of queue
    public int getSize() {
        return size;
    }

    // print queue
    void printQueue()
    {
        Element t = head;
        while (t != null)
        {
            System.out.print(t.value + " " );
            t = t.next;
        }
    }

}
