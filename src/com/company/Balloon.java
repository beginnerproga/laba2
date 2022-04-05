package com.company;

import static java.lang.Math.pow;

public class Balloon extends Space {
    double S;
    double r;
    double V;
    public void square(double r) {
        S = (4 * 3.14 * pow(r, 3)) / 3;
        System.out.println("Плошадь шара равна " + S);
    }

    public void Volume(double r, double h) {
        V = 4 * 3.14 * pow(r, 2);
        System.out.println("Объём шара равен " + V);
    }
}