/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author jgari
 */
public class Figure1 {

//Variables
    private int row;
    private int column;
    private int width;
    private int height;

//Constructors
    public Figure1() {
        this.row = 0;
        this.column = 0;
        this.width = 0;
        this.height = 0;
    }

//Getters & Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
} //Class End
