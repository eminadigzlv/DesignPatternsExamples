package patterns.creational.abstractfactory.windows;

import patterns.creational.abstractfactory.Button;
import patterns.creational.abstractfactory.GuiCommenentFactory;
import patterns.creational.abstractfactory.Select;

public class GuiCompenentWindowsFactory implements GuiCommenentFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        return new WindowsSelecet();
    }
}
