package behavioral.template_method.example;

public class FatPersonBMI implements Template{
    @Override
    public Integer getWeight() {
        return 200;
    }

    @Override
    public Integer getHeight() {
        return 2;
    }
}
