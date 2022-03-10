package patterns.creational.prototip.deepcopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertyDeepMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        Class2 class2= new Class2(4,list);
        Class2 class3=class2.clone();
        System.out.println(class2);
        System.out.println(class3);
        list.add(5);
        System.out.println(class2);
        System.out.println(class3);


    }
}
