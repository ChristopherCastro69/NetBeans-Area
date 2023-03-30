/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjhello;

/**
 *
 * @author L14Y09W08
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
    length = 0;
    width = 0;
    };
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length >= 0)
        this.length = length;
    }

    public void setWidth(double width) {
        if(width >= 0)
        this.width = width;
    }
    
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2*length + 2*width;
    }
    
    
}
