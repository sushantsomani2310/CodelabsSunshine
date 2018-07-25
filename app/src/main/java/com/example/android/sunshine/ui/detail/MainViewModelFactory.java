package com.example.android.sunshine.ui.detail;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.sunshine.data.SunshineRepository;
public class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final SunshineRepository mRespository;

    public MainViewModelFactory(SunshineRepository mRespository){
        this.mRespository=mRespository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass){
        return (T)new MainActivityViewModel(mRespository);
    }
}
