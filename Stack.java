import java.util.Iterator;

public class Stack<T> implements Iterable<Element> {

    private Element head;
    private int size;


    // add element
    public void push(T value){
        Element element = new Element(value);
        if (head == null){
            head = element;
        }else{
            element.next = head;
            head = element;
        }
        size++;
    }


    // delete element
    public void pop() throws EmptyStackException {
        if (head == null) {
            new EmptyStackException("Stack is empty");
        } else {
            head = head.next;
            size--;
        }
    }

    // size of stack
    public int getSize(){
        return size;
    }

    // print stack
    void printStack()
    {
        Element t = head;
        while (t != null)
        {
            System.out.print(t.value + " " );
            t = t.next;
        }
    }


    //////// Работает некорректно (не могу понять почему?)
    @Override
    public Iterator iterator() {
        return new Iterator<Element>() {
            private Element current = head;

            @Override
            public boolean hasNext() {
                return current.hasNext();
            }

            @Override
            public Element next() {
                Element result = current;
                if (current.hasNext()){
                    current = current.next;
                }
                return result;
            }
        };
    }


}
