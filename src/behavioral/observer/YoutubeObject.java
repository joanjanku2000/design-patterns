package behavioral.observer;

import java.util.List;

public class YoutubeObject {
    private String name;
    private List<String> posts;
    private List<YoutubeObject> subsrcibers;

    public void notify(Object o) {
        // do smth
    }

    public void postVideo(){
        // postimi videos
        subsrcibers.forEach(s -> s.notify("Une hodha video"));
    }
}
