package generic.ex2;

public class ObjectBox {

    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}