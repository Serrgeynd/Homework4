package Homework5.Homework5task2v2;

public class ActivCoolVideoCardFactory extends IronFactory {
    @Override
    public ActivCoolVideoCard creatIron() {
        return new ActivCoolVideoCard(256, "GDDR2", "Gigabyte");
    }
}

