package com.example.hydration;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class WaterRecord {

    // Object for water record, a day and # of glasses (per day)
    public WaterRecord(@NonNull String day, int glasses) {
        this.day = day;
        this.glasses = glasses;
    }

    @PrimaryKey
    @NonNull
    private String day;

    private int glasses;


    @NonNull
    public String getDay() {
        return day;
    }

    public void setDay(@NonNull String day) {
        this.day = day;
    }

    public int getGlasses() {
        return glasses;
    }

    public void setGlasses(int glasses) {
        this.glasses = glasses;
    }

    @Override
    public String toString() {
        return "WaterRecord{" +
                "day='" + day + '\'' +
                ", glasses=" + glasses +
                '}';
    }
}
