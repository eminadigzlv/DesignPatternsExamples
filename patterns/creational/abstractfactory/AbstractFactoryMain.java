package patterns.creational.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        GuiCommenentFactory factory = Confiqurator.confiq();
        Application application= new Application(factory);
        application.run();

    }
}
