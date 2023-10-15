package structural.adaptor.trainer;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper("Ernald","Zykaj", Arrays.asList("Java","C#","PHP"),3);
        Trainer trainer = new TrainerAdapter(softwareDeveloper);
        System.out.println(trainer);
    }
}
