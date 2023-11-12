package behavioral.memento.whatsapp;

import java.util.ArrayList;
import java.util.List;

public class WhatsappManager {
    private final List<WhatsappMemento> whatsappMementos;
    private WhatsappMemento lastWhatsappMemento;
    public WhatsappManager() {
        this.whatsappMementos = new ArrayList<>();
        lastWhatsappMemento = null;
    }

    private static Whatsapp from(WhatsappMemento whatsappMemento) {
        return new Whatsapp(whatsappMemento.getMessages(),
                whatsappMemento.getImageNames());
    }

    public void createMemento(Whatsapp whatsapp) {
        whatsappMementos.add(new WhatsappMemento(whatsapp));
        this.lastWhatsappMemento = new WhatsappMemento(whatsapp);
    }

    public Whatsapp restore(WhatsappMemento whatsappMemento) {
        return from(whatsappMemento);
    }

    public Whatsapp restorePrevious() {
        return restore(this.lastWhatsappMemento);
    }
}
