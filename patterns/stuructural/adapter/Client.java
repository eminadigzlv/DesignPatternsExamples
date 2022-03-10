package patterns.stuructural.adapter;

public class Client {
    HrSystem hrSystem;

    public Client(HrSystem hrSystem) {
        this.hrSystem = hrSystem;
        System.out.println("HrSystem worked");
    }
    void  run(){
        hrSystem.process();
        System.out.println("System run");

    }
}
