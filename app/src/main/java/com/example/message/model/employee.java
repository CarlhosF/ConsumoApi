package com.example.message.model;

public class employee {
    long id;
    String firstName;
    String lastName;
    String email;

    public employee() {

    }
    public employee(String firstname, String lasttname, String email) {
        this.firstName = firstname;
        this.lastName = lasttname;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLasttname() {
        return lastName;
    }

    public void setLasttname(String lasttname) {
        this.lastName = lasttname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
