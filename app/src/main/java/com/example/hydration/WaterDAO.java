package com.example.hydration;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WaterDAO {

    //SQL Statements to use
    @Insert(onConflict = OnConflictStrategy.IGNORE) // Ignore a new record for an existing day
    void insert(WaterRecord... wr);

    @Update
    void update(WaterRecord... wr);

    @Query("SELECT * FROM WaterRecord WHERE day = :day LIMIT 1")
    LiveData<WaterRecord> getRecordForDay(String day);

    @Query("SELECT * FROM WaterRecord")
    LiveData<List<WaterRecord>> getAllRecords();

}
