package behavioral.template_method.example;

public class ThinPersonBMI implements Bmi {
    @Override
    public Integer getWeight() {
        return 50;
    }

    @Override
    public Integer getHeight() {
        return 2;
    }
}
