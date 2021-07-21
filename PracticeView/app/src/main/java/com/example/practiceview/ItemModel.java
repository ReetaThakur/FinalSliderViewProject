package com.example.practiceview;

public class ItemModel {
    private int image;
    private String name;
    private int age;

    public ItemModel(int image, String name, int age) {
        this.image = image;
        this.name = name;
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
