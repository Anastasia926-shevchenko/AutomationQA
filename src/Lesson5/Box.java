package Lesson5;

public class Box {
    double height = 8.3;
    double width = 5.5;
    double length = 4.2;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box() {
    }

    public double getHeight() {
        return height;
    }

    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    public double getLength() {
        return length;
    }

    public double setLength(double length) {
        this.length = length;
        return length;
    }

    double calculationOfVolume(double length, double height, double width) {
        double boxVolume = length * height * width;
        return boxVolume;
    }

}
