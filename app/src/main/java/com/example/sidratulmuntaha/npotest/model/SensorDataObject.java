package com.example.sidratulmuntaha.npotest.model;


import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/**
 * Created by KaMaL on 24-2-2018.
 */

public class SensorDataObject {

    private String name;

    private int value;

    private String date;

    private String id;

    private int __v;

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDate() {
//        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");

//        Log.i("TAGG", "getDate: "+ (String)df.;

        return  date;

    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SensorDataObject(String name, int value, String date, String id, int __v) {
        this.name = name;
        this.value = value;
        this.date = date;
        this.id = id;
        this.__v = __v;
    }
    public  SensorDataObject(String name, int value, String date){
        this.name = name;
        this.value = value;
        this.date = date;
    }
}