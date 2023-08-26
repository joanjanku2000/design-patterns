package structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class AdaptorUsage {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new PupilAdapter(new Pupil("Andrzej", "Nowak", "anowak@sda.pl", 19, List.of(3, 4, 5))));
        for (final var student : students) {
            System.out.println(student.getFullName()); // Andrzej Nowak
            System.out.println(student.getContactDetails()); // anowak@sda.pl
            System.out.println(student.getResults()); // [3, 4, 5]
            System.out.println(student.isAdult()); // true
        }
    }
}