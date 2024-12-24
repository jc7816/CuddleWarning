package org.example;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        Frame frame = new Frame();
        Panel panel1 = new Panel();
        frame.setVisible(true);

        Drawing drawingCanvas = new Drawing();
        frame.add(drawingCanvas);
        drawingCanvas.setSize(600, 600);
        drawingCanvas.setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.setSize(drawingCanvas.getWidth(), drawingCanvas.getHeight());
        frame.setVisible(true);
        frame.addWindowListener(
                new WindowAdapter() {  // 创建一个 WindowAdapter 的匿名子类
                    @Override
                    public void windowClosing(WindowEvent e) {  // 重写 windowClosing 方法
                        frame.dispose();  // 当窗口关闭事件发生时，执行 frame.dispose() 关闭窗口
                    }
                });

        Keeper keeper1 = new Keeper("Geoff", "4392",80);


        Lion simba = new Lion("Simba",7,30);

        Drone drone1 = new Drone("Monitor1", 128,124);

        frame.add(drawingCanvas);

        try {
            while (true) {
                for (Locatable locatable : Locatable.locatables) {
                    locatable.setLocation(LocationSystem.getCoords(locatable.getGPStag()));
                }
                drawingCanvas.repaint();
                Thread.sleep(1000);

            }

        }

        catch(Exception e){}





    }






}