package patterns.stuructural.adapter;

public class OldSystem implements HrSystem{
    @Override
    public void process() {
        System.out.println("process work");
    }
}
