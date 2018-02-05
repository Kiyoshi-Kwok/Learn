package com.learn.basis.databaseaim;

import java.util.ArrayList;

public class Database {
    private ArrayList<Media> mediaArrayList = new ArrayList<Media>();

    public void add(Media... listMedia) { //multiple addition && can be replaced with Collection.addAll()
        for (Media media : listMedia) {
            mediaArrayList.add(media);
        }
    }

    public void list() {
        for (Media media : mediaArrayList) {
            media.print();
        }
    }
}
