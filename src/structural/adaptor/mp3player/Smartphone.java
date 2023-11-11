package structural.adaptor.mp3player;

import java.util.List;

public class Smartphone {
    private String type;
    private List<String> songs;

    public Smartphone(String type, List<String> songs) {
        this.type = type;
        this.songs = songs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "type='" + type + '\'' +
                ", songs=" + songs +
                '}';
    }
}
