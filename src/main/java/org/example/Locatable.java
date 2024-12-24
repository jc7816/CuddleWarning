package org.example;

import java.awt.*;
import java.util.ArrayList;

public interface Locatable {
    public static ArrayList<Locatable> locatables = new ArrayList<Locatable>();
    public default Point getLocation(){
        return null;
    }

    public void draw(Graphics g);

    public void setLocation(Point p);

    public int getGPStag();
}
