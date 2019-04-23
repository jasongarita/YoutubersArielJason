/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingJason;
import Domain.Figure1;
import Domain.Figure2;
import Domain.Figure3;

import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author jgari
 */



public class Launch {

    private Window myWindow;
    private Figure1 myCircle;
    private Figure2 mySquare;
    private Figure3 myRectangle;

//Figure1  Position
 
    int x = (int)(1+Math.random()*720);
    int y = (int)(1+Math.random()*512);
    
//Figure1 Random Path
    int directionX= x % 10 +1; 
    int directionY= y % 10 +1;
    int rCircle=35;
    
    
//Figure2 Position
   
    int i=(int)(1+Math.random()*720);
    int j=(int)(1+Math.random()*512);
    
//Figure2 RandomPath
    int directionI= i % 10 +1; 
    int directionJ= j % 10 +1; 
    int rSquare=35;

//Figure3
    int n = (int)(1+Math.random()*720);
    int m = (int)(1+Math.random()*512);
    
//Figure3 Random Path
    int directionN= n % 10 +1; 
    int directionM= m % 10 +1;
    int rRectangle=50; 

//Constructors
    public Launch(Window myDisplay){
        
        this.setMyWindow(myDisplay);
        this.setMyCircle(new Figure1());
        this.setMySquare(new Figure2());
        this.setMyRectangle(new Figure3());
        this.myWindow.setBackground(Color.BLACK);
        
//Figures Dimensions
        myCircle.setHeight(75);
        myCircle.setWidth(75);
        
        mySquare.setHeight(85);
        mySquare.setWidth(85);

        myRectangle.setHeight(75);
        myRectangle.setWidth(95);
    }

    
//While Bucle
    public void Launch(int waitingTime) throws InterruptedException 
    {

        while (true)
        {
            this.moveShapes();
            this.createImages();

 
            Thread.sleep(waitingTime);
        }
    }

//Figure Movement    
    public void moveShapes() {
    
//Circle 
    
        x+=directionX; 
        y+=directionY; 
        
  
        if ((x-rCircle) <= 0) 
            directionX*= -1; 
        else if ((x+rCircle) >= myWindow.getWindowWidth()) 
            directionX*= -1; 

        if ((y-rCircle) <= 0) 
            directionY*= -1; 
        else if ((y+rCircle) >= myWindow.getWindowHeight()) 
            directionY*= -1; 
        
//Square
 
        i+=directionI;
        j+=directionJ;
        
   
        if ((i-rSquare) <= 0) 
            directionI*= -1; 
        else if ((i+rSquare) >= myWindow.getWindowWidth()) 
            directionI*= -1; 

        if ((j-rSquare) <= 0) 
            directionJ*= -1; 
        else if ((j+rSquare) >= myWindow.getWindowHeight()) 
            directionJ*= -1; 
        
//Rectangle
        
        n+=directionN;
        m+=directionM;
        

        if ((n-rRectangle) <= 0) 
            directionN*= -1; 
        else if ((n+rRectangle) >= myWindow.getWindowWidth()) 
            directionN*= -1; 

        if ((m-rRectangle) <= 0) 
            directionM*= -1; 
        else if ((m+rRectangle) >= myWindow.getWindowHeight()) 
            directionM*= -1; 

    }

 
    public void createImages()
    {
        myWindow.initImage();
        Graphics graphic = myWindow.getGraphicsImage();

//Circle        
        graphic.setColor(Color.decode("#D31889"));
        graphic.fillOval(x-rCircle, y-rCircle, this.myCircle.getWidth(), this.myCircle.getHeight()); 

//Square        
        graphic.setColor(Color.decode("#3DCFB0"));
        graphic.fill3DRect(i-rSquare, j-rSquare, this.mySquare.getWidth(), this.mySquare.getHeight(), true);

//Rectangle        
        graphic.setColor(Color.decode("#87F55B"));
        graphic.fill3DRect(n-rRectangle, m-rRectangle, this.myRectangle.getWidth(), this.myRectangle.getHeight(), true);
        
        myWindow.paintAgain();
    }

//Getters & Setter

    

    public Window getMyWindow() {
        return myWindow;
    }

    public void setMyWindow(Window myWindow) {
        this.myWindow = myWindow;
    }

    public Figure1 getMyCircle() {
        return myCircle;
    }

    public void setMyCircle(Figure1 myCircle) {
        this.myCircle = myCircle;
    }
    
    public Figure2 getMySquare() {
        return mySquare;
    }
    public void setMySquare(Figure2 mySquare) {
        this.mySquare = mySquare;
    }

    public Figure3 getMyRectangle() {
        return myRectangle;
    }
    public void setMyRectangle(Figure3 myRectangle) {
        this.myRectangle = myRectangle;
    }
    

}//Class End
