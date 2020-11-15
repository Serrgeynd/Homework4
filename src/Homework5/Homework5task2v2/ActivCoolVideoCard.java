package Homework5.Homework5task2v2;


public class ActivCoolVideoCard extends VideoCard {

    private String produser;
    private String memoryType;
    private int memory;

    public ActivCoolVideoCard(int memory, String memoryType, String produser) {
        this.memory = memory;
        this.memoryType = memoryType;
        this.produser = produser;
        this.coolStrategy = new PassivCoolStrategy("Активное охлаждение");
        System.out.println(coolStrategy.cool());
    }

    @Override

    public void start() {
        System.out.println("Тип памяти:  " + memoryType + "  Объем памяти:  " + memory + "  Производитель:  " + produser);
    }
}

