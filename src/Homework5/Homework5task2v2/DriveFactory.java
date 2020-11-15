package Homework5.Homework5task2v2;

public class DriveFactory extends IronFactory {
    @Override
    public Drive creatIron() {
        return new Drive(2.4, "HDD", "seagate", "Внешний");
    }
}
