package com.example.iliqn.example.model;

public class Event {

    private String name;
    private String description;
    private String location;
    private int picture_id;
    private User owner;
    private String deadline;

    public Event(String name, String description, String location, int picture_id, User owner, String deadline) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.picture_id = picture_id;
        this.owner = owner;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getPicture_id() {
        return picture_id;
    }

    public User getOwner() {
        return owner;
    }

    public String getDeadline() {
        return deadline;
    }
}
