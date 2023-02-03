package GUI;

import Widget.*;

public class AndroidGuiFactory implements GUIFactory{


    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Checkbox createCheckBox()
    {
        return new AndroidCheckbox();
    }
}
