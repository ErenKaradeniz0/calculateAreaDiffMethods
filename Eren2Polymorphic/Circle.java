package Eren2Polymorphic;
public class Circle extends Point {
        int radius;
        public Circle(int radius) {
            this.radius = radius;
        }

    @Override
    public void CalculateArea(Point pointer) {
        totalcircleArea += Math.PI * radius * radius;
    }
}