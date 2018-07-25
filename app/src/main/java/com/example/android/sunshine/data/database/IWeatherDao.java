package com.example.android.sunshine.data.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.sql.Date;
import java.util.List;

@Dao
public interface IWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void bulkInsert(WeatherEntry... weather);

    @Query("SELECT * FROM weather WHERE date >=:date")
    LiveData<List<WeatherEntry>> getCurrentWeatherForecasts(Date date);

    @Query("SELECT * FROM weather WHERE date =:date")
    LiveData<WeatherEntry> getWeatherByDate(Date date);
}
