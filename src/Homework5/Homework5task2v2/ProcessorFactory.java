package Homework5.Homework5task2v2;

public class ProcessorFactory extends IronFactory {
    @Override
    public Processor creatIron() {
        return new Processor(2.4, 6, 128, "Celeron", "intel");
    }}





