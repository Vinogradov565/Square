import java.util.Scanner;

public class CalculateCylinderVolumeAndSurfaceArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус цилиндра (см): ");
        double radius = scanner.nextDouble();

        System.out.print("Введите высоту цилиндра (см): ");
        double height = scanner.nextDouble();

        scanner.close();

        double volume = Math.PI * Math.pow(radius, 2) * height;

        double surfaceArea = 2 * Math.PI * radius * height;

        System.out.println("Высота цилиндра = " + height + " см.");
        System.out.println("Объем цилиндра = " + volume + " см³.");
        System.out.println("Площадь боковой поверхности цилиндра = " + surfaceArea + " см².");
    }
}
