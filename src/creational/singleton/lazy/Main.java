package creational.singleton.lazy;

public class Main {

    public static void main(String[] args) {
        Coffe coffe = Coffe.getInstance();
        System.out.println(coffe);
    }
}
