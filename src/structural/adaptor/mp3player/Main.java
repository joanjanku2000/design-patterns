package structural.adaptor.mp3player;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Iphone 13 Pro",
                Arrays.asList("Java28", "Beat it - Michael Jackson", "Ardit Gjebrea"));

        Mp3PlayerAdaptor mp3PlayerAdaptor = new Mp3PlayerAdaptor(smartphone);

        System.out.println(mp3PlayerAdaptor.getSongs());
        System.out.println("Total songs are " + mp3PlayerAdaptor.getNumberOfSongs());
    }
}
