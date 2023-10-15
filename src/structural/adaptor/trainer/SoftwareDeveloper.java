package structural.adaptor.trainer;

import java.util.List;

public class SoftwareDeveloper {
    private String name;
    private String lastName;
    private List<String> programmingLanguages;
    private Integer experience;

    public SoftwareDeveloper(String name, String lastName, List<String> programmingLanguages, Integer experience) {
        this.name = name;
        this.lastName = lastName;
        this.programmingLanguages = programmingLanguages;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "SoftwareDeveloper{" + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", programmingLanguages=" + programmingLanguages + ", experience=" + experience + '}';
    }
}
