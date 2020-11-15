package Homework5.Homework5task2v2;


import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class PassivCoolVideoCard extends VideoCard {

    private String produser;
    private String memoryType;
    private int memory;

    public PassivCoolVideoCard(int memory, String memoryType, String produser) {
        this.memory = memory;
        this.memoryType = memoryType;
        this.produser = produser;
        this.coolStrategy = new PassivCoolStrategy("Пассивное охлаждение");
        System.out.println(coolStrategy.cool());
    }

    @Override

    public void start() {
        System.out.println("Тип памяти:  " + memoryType + "  Объем памяти:  " + memory + "  Производитель:  " + produser);
    }

}



