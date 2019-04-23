/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingJason;

/**
 *
 * @author jgari
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Window extends JFrame {

//Variables    
    private int windowWidth;
    private int windowHeight;
    private Image image;

//Construtors
    public Window(int posX, int posY, int windowWidth_, int windowHeight_) {

        this.windowHeight = windowHeight_;
        this.windowWidth = windowWidth_;
        this.setLocation(posX, posY);
        this.setSize(this.windowWidth, this.windowHeight);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Jason Swing Figures");
        this.setBackground(Color.BLACK);
        
    }

//Methods
    //InitImage
    public void initImage() {
        this.image = this.createImage(this.windowWidth, this.windowHeight);
    }

 //PaintAgain
    public void paintAgain() {
        repaint();
    }

//Paint Override
    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
        
    }
    
//Getters & Setters
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }


    public Graphics getGraphicsImage() {
        return this.image.getGraphics();
    }
}//Class End
