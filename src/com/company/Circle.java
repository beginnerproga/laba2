package com.company;

import static java.lang.Math.pow;

public class Circle extends Plane {
    double x;
    double y;
    double r;
    double s;
    public void square(double r) {
        s=3.14*pow(r,2);
        System.out.println("Плошадь круга равна "+s);
    }
}
