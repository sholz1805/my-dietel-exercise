package model;

import java.util.ArrayList;

public class Diary {

    private String ownerName;
    private ArrayList<Entry> entries = new ArrayList<>();
    private String password;

    public Diary(String name, String secretKey){
        ownerName = name;
        password = secretKey;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Entry> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<Entry> entries) {
        this.entries = entries;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
