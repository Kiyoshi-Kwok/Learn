package com.learn.basis.databaseaim;

public class DVD extends Media{
    private String director;

    public DVD(String title, String director, int playTime,String comment) {
        super(title, playTime, false, comment);
        this.director = director;
    }

    @Override
    public void print() {
        System.out.print("DVD: ");
        super.print();
        System.out.println(":" + director);
    }
}