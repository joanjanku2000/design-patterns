package behavioral.memento.whatsapp;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private List<String> messages;
    private List<String> imageNames;

    public Whatsapp(){
        this.messages = new ArrayList<>();
        this.imageNames = new ArrayList<>();
    }

    public Whatsapp(List<String> messages, List<String> imageNames) {
        this.messages = messages;
        this.imageNames = imageNames;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<String> getImageNames() {
        return imageNames;
    }

    public void setImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                "messages=" + messages +
                ", imageNames=" + imageNames +
                '}';
    }
}
