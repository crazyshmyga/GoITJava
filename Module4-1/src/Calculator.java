import java.lang.Math;
public class Calculator {
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        double square1 = triangle.squareTriangleCalculation(4.08, 4.07);
        System.out.println("Полощадь треугольника " + square1);

        Rectangle rectangle = new Rectangle();
        int square2 = rectangle.squareRectangleCalculation(4, 7);
        System.out.println("Полощадь прямоугольника " + square2);

        Circle circle = new Circle();
        double square3 = circle.squareCircleCalculation(3.07);
        System.out.println("Полощадь круга " + Math.round(square3));
    }
}
