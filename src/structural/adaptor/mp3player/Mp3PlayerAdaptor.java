package structural.adaptor.mp3player;

import java.util.List;

public class Mp3PlayerAdaptor implements Mp3Player {
    private Smartphone smartphone;

    public Mp3PlayerAdaptor(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public Integer getNumberOfSongs() {
        return smartphone.getSongs().size();
    }

    @Override
    public List<String> getSongs() {
        return smartphone.getSongs();
    }
}
