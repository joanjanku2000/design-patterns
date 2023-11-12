package behavioral.template_method.example;

public interface Bmi {

    Integer getWeight();
    Integer getHeight();

    default Integer calculateBmi(){
        return getWeight() / (getHeight() * getHeight());
    }

}
