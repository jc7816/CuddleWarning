package org.example;

import java.awt.*;
import java.util.ArrayList;

public class Lion implements Locatable{
    private String name;
    private int age;
    private int GPStag;
    private Point location;


    public Lion(String name, int age, int GPStag) {
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public int getGPStag() {
        return GPStag;
    }
    public Point getLocation() {
        return location;
    }

    public void draw(Graphics graphics){
        graphics.setColor(Color.red);
        graphics.drawOval(location.x-3,location.y-3,6,6);
        graphics.drawString(name+"Age:"+age,location.x+4,location.y);
    }


}
