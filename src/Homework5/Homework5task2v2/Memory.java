package Homework5.Homework5task2v2;

public class Memory implements Iron {
    private String produser;
    private int memory;
    private double frequency;
    private String memoryType;

    Memory(double frequency, int memory, String produser, String memoryType) {
        this.frequency = frequency;
        this.memory = memory;
        this.produser = produser;
        this.memoryType = memoryType;
    }

    @Override
    public void start() {
        System.out.println("Частота:  " + frequency + "  Память:  " + memory + "  Тип памяти:  " + memoryType + "  Производитель:  " + produser);
    }
}
