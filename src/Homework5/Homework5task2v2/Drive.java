package Homework5.Homework5task2v2;

public class Drive implements Iron {
    private String produser;
    private String type;
    private double memory;
    private String location;

    Drive(double memory, String type, String produser, String location) {
        this.type = type;
        this.memory = memory;
        this.produser = produser;
        this.location = location;
    }

    @Override
    public void start() {
        System.out.println("Тип :  " + type + "  Память:  " + memory + "  Производитель:  " + produser + "  ФормФактор:  " + location);
    }
}

