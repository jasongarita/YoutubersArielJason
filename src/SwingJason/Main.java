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
class Main {

//Variables
    static final int x = 100;
    static final int y = 100;
    static final int width = 800;
    static final int heigh = 600;
    static final int timer = 10;

    //LaunchApp
    public static void main(String[] args) throws InterruptedException {
        Window myWindow = new Window(x, y, width, heigh);
        Launch myLaunch = new Launch(myWindow);

        myWindow.setVisible(true);
        myLaunch.Launch(timer);
    }

}