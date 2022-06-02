package Eren;

public class Point {
    public static int totalcircleArea = 0;
    public static int totalRectangleArea = 0;
    public static int totalnullobjects = 0;

    public void CalculateArea(Point pointer) {
        if (pointer instanceof Circle) {
            totalcircleArea += Math.PI * ((Circle) pointer).radius * ((Circle) pointer).radius;
        } else if (pointer instanceof Rectangle) {
            totalRectangleArea += ((Rectangle) pointer).width * ((Rectangle) pointer).length;
        } else {
            totalnullobjects++;
        }
    }

    public void getAreas() {
        System.out.println("total circle area " + totalcircleArea);
        System.out.println("total rectangle area " + totalRectangleArea);
        System.out.println("total null  objects " + totalnullobjects);
    }
}
