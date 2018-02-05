package com.learn.basis.databaseaim;

public class CD extends Media{
    private String artist;
    private int numofTrakcs;

    public CD(String title, String artist, int numofTracks, int playTime, String comment) {
        super(title, playTime, false ,comment);
        this.artist = artist;
        this.numofTrakcs = numofTracks;
    }

    @Override
    public void print() {
        System.out.print("CD: ");
        super.print();
        System.out.println(":" + artist);
    }
}
