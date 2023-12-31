package entities;


import entitiesenums.Color;

public class Rectangle extends Shape {

    private double width;
    private double heigth;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return heigth * width;
    }

}
