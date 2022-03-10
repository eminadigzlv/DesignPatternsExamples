package patterns.creational.prototip.deepcopy;

import java.util.List;

public class AbstractClassDepp implements Cloneable{
    int x;
    List<Integer> list;

    public AbstractClassDepp(int x, List<Integer> list) {
        this.x = x;
        this.list = list;
    }

    @Override
    public String toString() {
        return "AbstractClassDepp{" +
                "x=" + x +
                ", list=" + list +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
