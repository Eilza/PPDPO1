package sbt.homework.design;

public class Rectangle implements Shape {
    public Rectangle(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }

    private double width;
    private double lenght;

    public double getArea(){
        return width*lenght;
    }
}
