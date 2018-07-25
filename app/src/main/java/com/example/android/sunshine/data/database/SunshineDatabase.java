package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

@Database(entities = {WeatherEntry.class},version = 1)
@TypeConverters(DateConverter.class)
public abstract class SunshineDatabase extends RoomDatabase{
    public abstract IWeatherDao weatherDao();

    private static final String DATABASE_NAME = "weather";

    //for singleton instantiation
    private static final Object LOCK=new Object();
    private static volatile SunshineDatabase sunshineDatabaseInstance;

    public static SunshineDatabase getInstance(Context context){
        if(sunshineDatabaseInstance==null){
            synchronized (LOCK){
                if(sunshineDatabaseInstance==null){
                    sunshineDatabaseInstance= Room.databaseBuilder(context.getApplicationContext(),SunshineDatabase.class,SunshineDatabase.DATABASE_NAME).build();
                }
            }
        }
        return sunshineDatabaseInstance;
    }
}
