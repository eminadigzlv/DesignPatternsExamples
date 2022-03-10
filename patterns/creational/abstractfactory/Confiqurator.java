package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.linux.GuiCompenentLinuxFactory;
import patterns.creational.abstractfactory.windows.GuiCompenentWindowsFactory;

import java.util.Random;
import java.util.Scanner;

public class Confiqurator {
    public static GuiCommenentFactory confiq(){
        GuiCommenentFactory factory=null;
        Scanner scanner= new Scanner(System.in);
        String s= scanner.nextLine();
        if(s.equals("windows")){

            factory= new GuiCompenentWindowsFactory();
        }else if(s.equals("linux"))
        {
            factory=  new GuiCompenentLinuxFactory();

        }
        return  factory;

    }
}
