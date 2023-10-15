package structural.adaptor.trainer;

import java.util.List;

public class TrainerAdapter implements Trainer {
    private final SoftwareDeveloper softwareDeveloper;

    public TrainerAdapter(SoftwareDeveloper softwareDeveloper) {
        this.softwareDeveloper = softwareDeveloper;
    }

    @Override
    public String fullName() {
        return softwareDeveloper.getName() + " " + softwareDeveloper.getLastName();
    }

    @Override
    public List<String> subjects() {
        return softwareDeveloper.getProgrammingLanguages();
    }

    @Override
    public boolean isQualified() {
        return softwareDeveloper.getExperience() >= 2;
    }

    public String toString() {
        return "Trainer [" + fullName() + ", " + subjects() + ", " + isQualified() + "]";
    }
}
