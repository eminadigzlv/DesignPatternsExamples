package patterns.creational.abstractfactory;

public class Application {
    GuiCommenentFactory factory;

    public Application(GuiCommenentFactory factory) {
        this.factory = factory;
    }
    public  void run(){
        Button button= factory.createButton();
        Select select=factory.createSelect();
        System.out.println("Application is run");
    }
}
