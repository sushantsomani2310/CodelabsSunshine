package com.example.android.sunshine.ui.detail;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private final LiveData<List<WeatherEntry>> mForecast;
    private final SunshineRepository mRepository;

    public MainActivityViewModel(SunshineRepository mRepository){
        this.mRepository=mRepository;
        mForecast=mRepository.getCurrentWeatherForecasts();
    }

    public LiveData<List<WeatherEntry>> getForecast() {
        return mForecast;
    }
}
