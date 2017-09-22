

public class Element<T> {

    Element next;
    public T value;

    Element(T value) {
        this.value = value;
    }

    public boolean hasNext(){
        if (next == null) return false;
        return true;
    }

    @Override
    public String toString() {
        return value.toString();
    }


}
