package org.example;

import java.awt.*;
import java.util.ArrayList;

public class Keeper implements Locatable{
    private String name;
    private String phoneNumber;
    private int GPStag;
    public Point location;


    public Keeper(String name, String phoneNumber, int GPStag) {
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public int getGPStag() {
        return GPStag;
    }
    public Point getLocation() {
        return location;
    }

    public void draw(Graphics graphics){
        graphics.setColor(Color.blue);
        graphics.drawOval(location.x-2,location.y-2,4,4);
        graphics.drawString(name+"PoneNum:"+phoneNumber,location.x+4,location.y);
    }

}
