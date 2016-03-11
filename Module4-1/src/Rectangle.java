/**
 * Created by A on 11.03.2016.
 */
public class Rectangle {
    int firstSide; //Сторона прямоугольника АВ
    int secondSide; // Сторона прямоугольника АС
    int squareRectangle; // Площадь прямоугольника

    public int squareRectangleCalculation(int firstSide, int secondSide) {
        return squareRectangle = (firstSide * secondSide) / 2;
    }
}