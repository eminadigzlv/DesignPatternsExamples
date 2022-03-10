package patterns.creational.prototip.shallowcopy;

public class PrototypeShallowMain {

    public static void main(String[] args) {

        try {
            Class1 class1= new Class1(4,5);
            Class1 class2= class1.clone();
            System.out.println(class1);
            System.out.println(class2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
