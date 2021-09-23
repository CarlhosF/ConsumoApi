package com.example.message.model;

public class Messege {
    String autor;
    String messg;

    public Messege() {

    }
    public Messege(String autor,String mssg) {
        this.autor = autor;
        this.messg=mssg;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
