package sbt.homework.design;

public class Circle implements Shape{
    public Circle(double radius){
        this.radius = radius;
    }
    private double radius;

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
