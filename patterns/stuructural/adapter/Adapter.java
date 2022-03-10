package patterns.stuructural.adapter;

public class Adapter implements HrSystem{

    NewHrSytem hrSytem;

    public Adapter(NewHrSytem hrSytem) {
        this.hrSytem = hrSytem;
    }

    @Override
    public void process() {
        hrSytem.process1();
        hrSytem.process2();
    }
}
