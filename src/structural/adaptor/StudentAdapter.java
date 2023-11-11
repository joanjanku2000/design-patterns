package structural.adaptor;

import java.util.Collection;

public class StudentAdapter implements Student {

    private final Pupil pupil;

    public StudentAdapter(Pupil pupil) {
        this.pupil = pupil;
    }

    @Override
    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    @Override
    public String getContactDetails() {
        return pupil.getEmail();
    }

    @Override
    public boolean isAdult() {
        return pupil.getAge() >= 18;
    }

    @Override
    public Collection<Integer> getResults() {
        return pupil.getGrades();
    }
}
