package org.example;

import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {




    public void paint(Graphics graphic) {
        for (Locatable locatable : Locatable.locatables) {
            locatable.draw(graphic);

        }
    }
}