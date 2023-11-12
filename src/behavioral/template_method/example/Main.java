package behavioral.template_method.example;

public class Main {
    public static void main(String[] args) {
        Bmi template = new FatPersonBMI();
        System.out.println(template.calculateBmi());
    }
}
