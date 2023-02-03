package org.example;

import GUI.GUIFactory;
import GUI.WindowsGuiFactory;
import Widget.WidgetInterface;

public class Main {
    public static void main(String[] args) {

        GUIFactory guiFactory = new WindowsGuiFactory();

        WidgetInterface button = guiFactory.createButton();
        WidgetInterface checkbox = guiFactory.createCheckBox();

        button.paint();
        checkbox.paint();

    }
}