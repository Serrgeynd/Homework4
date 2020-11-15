package Homework5.Homework5task2v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите устройство:  ");
        Scanner scanner = new Scanner(System.in);
        IronType type = null;
        try {
            type = IronType.valueOf(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Устройство указанно некорректно");
            System.exit(0);
        }
        IronFactory factory = null;

        switch (type) {
            case PROCESSOR:
                factory = new ProcessorFactory();
                break;
            case ACTIVCOOLVIDEOCARD:
                factory = new ActivCoolVideoCardFactory();
                break;
            case PASSIVCOOLVIDEOCARD:
                factory = new PassivCoolVideoCardFactory();
                break;
            case MEMORY:
                factory = new MemoryFactory();
                break;
            case DRYVE:
                factory = new DriveFactory();
                break;
            default:
        }
        if (factory != null) {
            Iron iron = factory.creatIron();
            iron.start();
        }
    }
}

