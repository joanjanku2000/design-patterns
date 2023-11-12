package behavioral.template_method.example;

public class Main {
    public static void main(String[] args) {
        Template template = new FatPersonBMI();
        System.out.println(template.calculateBmi());
    }
}
