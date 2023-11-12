package behavioral.observer.instagram;

import java.util.ArrayList;
import java.util.List;

public class InstaUser {
    private String username;
    private String fullName;
    private List<InstaUser> followers;
    private List<InstaUser> following;
    private List<String> posts;
    private List<InstaUser> viewers;

    public InstaUser(String username, String fullName){
        this.username = username;
        this.fullName = fullName;
        this.following = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.viewers = new ArrayList<>();
    }

    public void follow(InstaUser instaUser) {
        this.following.add(instaUser);
        instaUser.addFollower(this);
    }

    public void addFollower(InstaUser instaUser){
        this.followers.add(instaUser);
    }

    public void post(String data) {
        this.posts.add(data);
        for (InstaUser u : followers){
            u.notifyForPost(this,data);
        }
    }

    public void notifyForPost(InstaUser instaUser,String data) {
        System.out.println(instaUser.fullName + " posted " + data);
    }

    public void seeProfile(InstaUser instaUser) {
        instaUser.notifyForPost(this,"Une te pashe profilin");
        instaUser.viewers.add(instaUser);
    }
}
