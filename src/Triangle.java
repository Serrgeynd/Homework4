import java.util.Scanner;

public class Triangle implements Shape {

    Scanner scanner = new Scanner(System.in);
    double a;
    double h;

    public double square() {
        System.out.println("Введите высоту и прилегающую сторону: ");
        a = scanner.nextDouble();
        h = scanner.nextDouble();
        double s = a * h / 2;
        return s;
    }

}

