package structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class AdaptorUsage {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        PupilAdapter pupilAdapter = new PupilAdapter(new Pupil("Joan", "Janku", "jjanku@gmail.com", 19, List.of(3, 4, 5)));
        students.add(pupilAdapter);

        for (final var student : students) {
            System.out.println(student.getFullName()); // Joan Janku
            System.out.println(student.getContactDetails()); // jjanku@gmail.com
            System.out.println(student.getResults()); // [3, 4, 5]
            System.out.println(student.isAdult()); // true
        }
    }
}