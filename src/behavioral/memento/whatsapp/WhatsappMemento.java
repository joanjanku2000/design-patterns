package behavioral.memento.whatsapp;

import java.util.List;

public final class WhatsappMemento {
    private List<String> messages;
    private List<String> imageNames;

    public WhatsappMemento(Whatsapp whatsapp){
        this.messages = whatsapp.getMessages();
        this.imageNames = whatsapp.getImageNames();
    }

    public List<String> getMessages() {
        return messages;
    }

    public List<String> getImageNames() {
        return imageNames;
    }

    @Override
    public String toString() {
        return "WhatsappMemento{" +
                "messages=" + messages +
                ", imageNames=" + imageNames +
                '}';
    }
}
