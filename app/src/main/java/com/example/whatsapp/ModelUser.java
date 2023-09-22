package com.example.whatsapp;

public class ModelUser {

    private String name;
    private String emil;


    private String image;
    private String uId;

    public ModelUser() {
    }

    public ModelUser(String name, String emil, String image, String uId) {
        this.name = name;
        this.emil = emil;
        this.image = image;
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public String getEmil() {
        return emil;
    }

    public String getImage() {
        return image;
    }

    public String getuId() {
        return uId;
    }
}