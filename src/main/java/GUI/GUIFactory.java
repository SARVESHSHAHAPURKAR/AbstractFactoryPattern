package GUI;

import Widget.Button;
import Widget.Checkbox;
import Widget.WidgetInterface;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckBox();

}
