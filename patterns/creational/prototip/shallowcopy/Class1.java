package patterns.creational.prototip.shallowcopy;

public class Class1 extends AbstractClass {
    public Class1(int x, int y) {
        super(x, y);
    }

    @Override
    protected Class1 clone() throws CloneNotSupportedException {
        return (Class1)super.clone();
    }
}
