package com.azoresume.model;

public class Experience {
    private String company;
    private String position;
    private String duration;
    private String description;

    public Experience(String company, String position, String duration, String description) {
        this.company = company;
        this.position = position;
        this.duration = duration;
        this.description = description;
    }

    public String getCompany() { return company; }
    public String getPosition() { return position; }
    public String getDuration() { return duration; }
    public String getDescription() { return description; }
}
