package org.example;

import java.awt.*;
import java.util.ArrayList;

public class Drone implements Locatable{
    private String name;
    private int freq;
    private int GPStag;
    private Point location;


    public Drone(String name, int freq, int GPStag) {
        this.name = name;
        this.freq = freq;
        this.GPStag = GPStag;
        location = new Point();
        Locatable.locatables.add(this);
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }


    public int getGPStag() {
        return GPStag;
    }
    public Point getLocation() {
        return location;
    }
    public void draw(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.drawRect(location.x-1,location.y-1,3,3);
        graphics.drawString(name+"Freq:"+freq,location.x+4,location.y);
    }

}
