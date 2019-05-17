package model;


import sound.MidiSynth;

import java.awt.*;


public class Rectangle extends Shape{



    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft,midiSynth);
    }


    public Rectangle(int x, int y, int w, int h) {
        super(x,y,w,h);
    }



    //EFFECTS: draws the shape
    protected void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    //EFFECTS: fills the shape
    protected void fillGraphics(Graphics g) {
        System.out.println();
        g.fillRect(x, y, width, height);
    }


}
