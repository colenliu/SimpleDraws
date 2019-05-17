package model;


import sound.MidiSynth;

import java.awt.*;


public class Oval extends Shape{



    public Oval(Point topLeft, MidiSynth midiSynth) {
        super(topLeft,midiSynth);
        instrument = 14;
    }


    public Oval(int x, int y, int w, int h) {
        super(x,y,w,h);
    }



    //EFFECTS: draws the shape
    protected void drawGraphics(Graphics g) {
        g.drawOval(x, y, width, height);
    }

    //EFFECTS: fills the shape
    protected void fillGraphics(Graphics g) {
        System.out.println();
        g.fillOval(x, y, width, height);
    }


}
