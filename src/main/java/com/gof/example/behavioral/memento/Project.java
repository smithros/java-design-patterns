package com.gof.example.behavioral.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project:\n" +
            "\nVersion: " + version +
            "\nDate: " + date + "\n";
    }
}
