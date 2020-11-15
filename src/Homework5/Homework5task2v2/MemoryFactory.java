package Homework5.Homework5task2v2;

public class MemoryFactory extends IronFactory {
    @Override
    public Memory creatIron() {
        return new Memory(133, 128, "HP", "DDR");
    }
}

