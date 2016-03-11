import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        double x1=4;
        double y1=5;
        double x2=2;
        double y2=3;
        double distance = Math.sqrt((Math.pow((x1-x2),2)+ Math.pow((y1-y2),2)));
        System.out.println("Расстояние между точками " + Math.round(distance));
    }
}
