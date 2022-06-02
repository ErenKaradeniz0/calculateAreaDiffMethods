package Eren2Polymorphic;

public class Shapes {
    public static void main(String[] args) {
        Point[] shapes = new Point[20];
        //add shapes
        shapes[1] = (new Circle(10));
        shapes[2] = (new Rectangle(10, 20));
        shapes[3] = (new Rectangle(100, 100));
        shapes[4] = (new Circle(50));
        Point pointer = new Point();
        for (Point shape : shapes) {
            if (shape != null)
                shape.CalculateArea(pointer);
        }
        pointer.getAreas();
    }
}
