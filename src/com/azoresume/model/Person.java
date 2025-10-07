package com.azoresume.model;

public class Person {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String summary;

    public Person(String name, String email, String phone, String address, String summary) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.summary = summary;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getSummary() { return summary; }
}
