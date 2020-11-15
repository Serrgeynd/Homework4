package Homework5.homework5task2;


import Homework5.*;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;

public class AppLogger {
    public static void main(String[] args) {

        System.out.println("Введите выражение:");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Calculator2 calculator2 = new Calculator2();
        calculator2.x = scanner.nextDouble();
        calculator2.act = scanner.next().charAt(0);
        calculator2.y = scanner.nextDouble();
        calculator2.getMultiplication();
        calculator2.getDivision();
        calculator2.getSubstraction();
        calculator2.getAddition();
        System.out.println("Для вывода в консоль введите CL, в файл FL, в Database DL");
        Scanner scanner1 = new Scanner(System.in);
        LoggerType type = null;
        try {
            type = LoggerType.valueOf(scanner1.nextLine());

        } catch (Exception e) {
            System.out.println("Данное место недоступно для записи");
            System.exit(0);

        }
        LoggerFactory factory = null;
        switch (type) {
            case CL:
                factory = new ConsoleLoggerFactory();
                break;
            case FL:
                factory = new FileLoggerFactory();
                break;
            case DL:
                factory = new DbLoggerFactory();
                break;
            default:
                System.out.println("Ошибка ввода");

        }
        if (factory != null) {
            Logger logger = factory.createLogger();
            logger.log("Результат вычисления=  " + calculator2.z);
            java.util.logging.Logger logger1 = java.util.logging.Logger.getLogger(Calculator2.class.getName());
            logger1.log(Level.INFO, "Результат:  " + calculator2.z);

        }
    }
}
