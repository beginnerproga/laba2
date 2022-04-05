package com.company;

import static java.lang.Math.pow;

public class Cylinder extends Space {
    double r;
    double s;
    double s1;
    double s2;
    double h;
    double V;
    public void square(double r) {
        s = 3.14 * pow(r, 2);
        System.out.println("Плошадь основания цилиндра равна " + s);
    }
    public void square1(double r,double h){
        s1=2*3.14*r*h;
        System.out.println("Боковая плошадь цилиндра равна " + s1);
    }
    public void square2(double r,double h){
        s2=(3.14 * pow(r, 2))+(2*3.14*r*h);
        System.out.println("Общая площадь фигуры "+s2);
    }
    public void Volume(double r,double h){
        V=3.14*pow(r, 2)*h;
        System.out.println("Объём цилиндра равен "+V);
    }

}