package patterns.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {
        TemplateBase templateBase= new Template1();
        templateBase.work();

        templateBase=new Template2();
        templateBase.work();
    }
}
