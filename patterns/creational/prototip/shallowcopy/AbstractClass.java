package patterns.creational.prototip.shallowcopy;

public class AbstractClass implements Cloneable{
    int x;
    int y;

    public AbstractClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "AbstractClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
