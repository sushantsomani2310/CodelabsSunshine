//package com.example.android.sunshine.ui.detail;
//
//import android.arch.lifecycle.ViewModelProviders;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.RecyclerView;
//import android.widget.ProgressBar;
//
//import com.example.android.sunshine.utilities.InjectorUtils;
//
//public class MainActivity extends AppCompatActivity{
//
//    private ForecastAdapter mForecastAdapter;
//    private RecyclerView mRecyclerView;
//    private int mPosition = RecyclerView.NO_POSITION;
//    private ProgressBar mLoadingIndicator;
//    private MainActivityViewModel mViewModel;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        showLoading();
//
//        MainViewModelFactory factory = InjectorUtils.provideMainActivityViewModelFactory(this.getApplicationContext());
//        mViewModel = ViewModelProviders.of(this, factory).get(MainActivityViewModel.class);
//                mViewModel.getForecast().observe(this, weatherEntries -> {
//                mForecastAdapter.swapForecast(weatherEntries);
//                if (mPosition == RecyclerView.NO_POSITION) mPosition = 0;
//                mRecyclerView.smoothScrollToPosition(mPosition);
//
//                // Show the weather list or the loading screen based on whether the forecast data exists
//                // and is loaded
//                if (weatherEntries != null && weatherEntries.size() != 0) showWeatherDataView();
//                else showLoading();
//                });
//    }
//}
