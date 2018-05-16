package com.nhom3.project.data_models;

import android.widget.ArrayAdapter;

/**
 * Created by IT on 10/16/2017.
 */

public class NhanSu{
    private String name;
    private int degreen;
    private String hobby;
    private boolean isChecked;

    public NhanSu(String name, int degreen, String hoppy) {
        this.name = name;
        this.degreen = degreen;
        this.hobby = hoppy;
        this.isChecked = false;
    }
    public boolean setChecked(boolean isChecked)
    {
        return this.isChecked = isChecked;
    }
    public boolean isChecked(){return isChecked;}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegreen() {
        return degreen;
    }

    public void setDegreen(int degreen) {
        this.degreen = degreen;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHoppy(String hobby) {
        this.hobby = hobby;
    }
}
