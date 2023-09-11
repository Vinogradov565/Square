import java.util.Scanner;

public class CalculateCircleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();


        scanner.close();


        double area = Math.PI * Math.pow(radius, 2);


        System.out.println("Радиус = " + radius);
        System.out.println("Площадь круга = " + area);
    }
}
