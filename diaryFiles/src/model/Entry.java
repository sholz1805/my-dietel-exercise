package model;

import java.time.LocalDateTime;

public class Entry {

    private String title;
    private LocalDateTime time = LocalDateTime.now();
    private String gist;

    public Entry(String title, String gossipProper){
        this.title = title;
        gist = gossipProper;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }
}
