package com.learn.basis.databaseaim;

public class Media {
    private String title;
    private int playTime;
    private boolean possession;
    private String comment;

    public Media(String title, int playTime, boolean possession, String comment) {
        this.title = title;
        this.playTime = playTime;
        this.possession = possession;
        this.comment = comment;
    }

    public void print() {
        System.out.print(title);
    }
}