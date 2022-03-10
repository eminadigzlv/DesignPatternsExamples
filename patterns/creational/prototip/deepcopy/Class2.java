package patterns.creational.prototip.deepcopy;

import java.util.ArrayList;
import java.util.List;

public class Class2 extends AbstractClassDepp {

    public Class2(int x, List<Integer> list) {
        super(x, list);
    }

    @Override
    protected Class2 clone() throws CloneNotSupportedException {
        Class2 clone = (Class2)super.clone();
        List<Integer> list= new ArrayList<>(getList());
        clone.setList(list);
        return clone;
    }
}
