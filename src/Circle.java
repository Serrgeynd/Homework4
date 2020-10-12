import java.util.Scanner;

public class Circle<PI> implements Shape {
    public double r = 10;
    Scanner scanner = new Scanner(System.in);

    public double square() {
        System.out.println("Введите радиус: ");
        r = scanner.nextDouble();
        double s = Math.PI * r * r;
        return s;
    }

}