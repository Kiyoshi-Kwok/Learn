package com.learn.basis.databaseaim;

public class MP3 extends Media{
    private String artist;

    public MP3(String title, String artist, int playTime, String comment) {
        super(title, playTime, false ,comment);
        this.artist = artist;
    }

    @Override
    public void print() {
        System.out.print("MP3: ");
        super.print();
        System.out.println(":" + artist);
    }
}
