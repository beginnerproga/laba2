package com.company;

import static java.lang.Math.sqrt;

public class ComplexOperations extends Arithmetic {
    double z1;
    double z2;
    double a;
    double b;
    double a1;
    double b1;
    double a2;
    double b2;
    public void sum(double a, double b,double a1, double b1){
        a2=a+a1;
        b2=b+b1;
        System.out.println("Действительная часть = "+a2);
        System.out.println("Мнимая часть = "+b2);
        System.out.println("Общая формула суммы комплексных чисел "+a2+"+"+b2+"i");
    }
    public void radius(double a, double b) {
        z1 = sqrt(a + b);
        System.out.println("Радиус равен " + z1);
    }
    public void subtraction(double a, double b,double a1, double b1){
        a2=a-a1;
        b2=b-b1;
        System.out.println("Действительная часть = "+a2);
        System.out.println("Мнимая часть = "+b2);
        System.out.println("Общая формула вычитания комплексных чисел "+a2+"+"+b2+"i");
    }
}