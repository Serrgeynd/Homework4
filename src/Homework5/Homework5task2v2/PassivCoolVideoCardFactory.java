package Homework5.Homework5task2v2;

public class PassivCoolVideoCardFactory extends IronFactory {
    @Override

    public PassivCoolVideoCard creatIron() {
        return new PassivCoolVideoCard(128, "GDDR", "invidia");
    }

}
