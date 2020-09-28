public class Triangle implements Shape {
    double a = 3;
    double b = 4;


    public double square() {
        double s = a * b / 2;

        return s;
    }

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle();
        shape[1] = new Circle();
        shape[2] = new Rectangle();
        for (Shape sh : shape) System.out.println("Площадь фигуры: " + sh.square());

    }
}

