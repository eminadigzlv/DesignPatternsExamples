package patterns.behavioral.observe;

public class MainClass3 {
    public static void main(String[] args) {
        Subscribe subscribe= new Subscribe();
        Student student= new Student( "Aygun",222);
        Student student1= new Student("Rubabe",2333);
        Student student2= new Student("Sevinc",333);
        Student student3= new Student("Leman",333);
        subscribe.subscribe(student);
        subscribe.subscribe(student1);
        subscribe.subscribe(student2);
        subscribe.subscribe(student3);
        Event event = new Event("sewbejwbbwdhbdhwdb");
        subscribe.call(event);

    }
}
