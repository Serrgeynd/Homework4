package Homework5.Homework5task2v2;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class VideoCard implements Iron {

    CoolStrategy coolStrategy;

    public VideoCard() {
    }

    public void cool() {
        coolStrategy.cool();
    }

    @Override

    public void start() {
        System.out.println();
    }
}



