package patterns.creational.abstractfactory.linux;

import patterns.creational.abstractfactory.Button;
import patterns.creational.abstractfactory.GuiCommenentFactory;
import patterns.creational.abstractfactory.Select;

public class GuiCompenentLinuxFactory implements GuiCommenentFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Select createSelect() {
        return new LinuxSelect();
    }
}
