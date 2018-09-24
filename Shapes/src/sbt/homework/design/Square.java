package sbt.homework.design;

public class Square implements Shape {
    public Square(double side){
        this.side = side;
    }
    private double side;

    public double getArea(){
        return Math.pow(side,2);
    }
}
