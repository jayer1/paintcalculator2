
public class Paintbrush<T> {

    private T color;

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    public Paintbrush(T color) {
        this.color = color;
    }

}
