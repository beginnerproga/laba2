package com.company;
public class Rectangle extends Plane {
    double x;
    double y;
    double s;
    public void square (double x,double y){
        s=y*x;
        System.out.println("Плошадь прямоугольника равна "+s);
    }

}