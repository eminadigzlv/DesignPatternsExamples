package patterns.behavioral.observe;

public class Student implements  Candidate{
    private  String name;
    private  long id;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public void call(Event event) {
        System.out.println(name + id +" get "+ event.getData());
    }
}
