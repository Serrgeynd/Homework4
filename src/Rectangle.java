import java.util.Scanner;

public class Rectangle implements Shape {
    public double a = 3;
    public double b = 3;
    Scanner scanner = new Scanner(System.in);

    public double square() {
        System.out.println("Введите стороны a и b: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        double s = a * b;
        return s;


    }
}


