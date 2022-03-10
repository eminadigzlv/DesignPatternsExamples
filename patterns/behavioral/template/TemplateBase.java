package patterns.behavioral.template;

import java.util.Random;

public abstract class TemplateBase {

    public  void work()
    {
        step1();
        if(step2()){
            step3();
        }else
        {
            step4();
        }
        step5();
    }
    public  void step1(){
        System.out.println("Step1 called and connection connect");
    }
    public boolean step2(){
        Random random = new Random();
        boolean value=random.nextBoolean();
        if (value==true){
            System.out.println("Step2 back true value");
        }
        return  value;
    }
    public abstract  void step3();
    public abstract  void  step4();
    public void step5(){
        System.out.println("Step5 called and the end");
    }
}
