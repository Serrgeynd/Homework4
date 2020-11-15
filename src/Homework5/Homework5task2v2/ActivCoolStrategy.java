package Homework5.Homework5task2v2;

public class ActivCoolStrategy implements CoolStrategy {
    private String coolType;

    public ActivCoolStrategy(String coolType) {
        this.coolType = coolType;
    }

    @Override
    public String cool() {
        return coolType;
    }
}











