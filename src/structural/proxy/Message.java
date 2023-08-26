package structural.proxy;


import java.time.LocalDateTime;


public class Message {
    private String channelName;
    private LocalDateTime postDate;
    private String author;
    private String text;

    public Message(final String channelName, final String author, final String text) {
        this.channelName = channelName;
        this.author = author;
        this.text = text;
        this.postDate = LocalDateTime.now();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "channelName='" + channelName + '\'' +
                ", postDate=" + postDate +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
