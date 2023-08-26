package structural.adaptor;

import java.util.List;

public class Pupil {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Integer age;
    private final List<Integer> grades;

    public Pupil(final String firstName, final String lastName, final String email, final Integer age, final List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
