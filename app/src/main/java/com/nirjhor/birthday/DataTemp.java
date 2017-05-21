package com.nirjhor.birthday;

/**
 * Created by nirjhor on 5/21/2017.
 */

public class DataTemp {


    private int id;
    private String name;
    private String day;


    public DataTemp(String n,String d)
    {
        name = n;
        day = d;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public String getName() {
        return name;
    }
}
