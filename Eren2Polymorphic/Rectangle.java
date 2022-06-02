package Eren2Polymorphic;

public class Rectangle extends Point {
    int length, width;

    public Rectangle(int width, int length) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void CalculateArea(Point pointer) {
        totalRectangleArea += width * length;
    }
}
