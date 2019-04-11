package com.example.sidratulmuntaha.npotest.model;

public class DataObject {

    private String id;
    private String title;
    private String resume;
    private String date;
    private String img;

    public DataObject( String title, String resume, String date, String img) {

        this.title = title;
        this.resume = resume;
        this.date = date;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}