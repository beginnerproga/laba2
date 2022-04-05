package com.company;

public class Main {

    public static void main(String[] args) {
        RealOperations realoperations = new RealOperations();
        System.out.println("Сумма двух чисел = "+realoperations.sum(4.2,5.6));
        ComplexOperations complexoperations = new ComplexOperations();
        complexoperations.radius(4.0,5);
        complexoperations.subtraction(4,5,1,3);
        Circle circle= new Circle();
        circle.square(3);
        Rectangle rectangle = new Rectangle();
        rectangle.square(3,4);    }
}
