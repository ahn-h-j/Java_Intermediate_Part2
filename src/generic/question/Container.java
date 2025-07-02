package generic.question;

public class Container<T> {
    private T data;
    public boolean isEmpty() {
        return data == null;
    }

    public void setItem(T data) {
        this.data = data;
    }

    public T getItem() {
        return data;
    }
}
