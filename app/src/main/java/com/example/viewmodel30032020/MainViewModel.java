package com.example.viewmodel30032020;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainViewModel extends ViewModel implements LifecycleObserver {
    private MutableLiveData<Integer> mDataRandom;

    public MainViewModel() {
        this.mDataRandom = new MutableLiveData<>();
    }

    public void randomNumber(int bound){
        Random random = new Random();
        int value = random.nextInt(bound);
        mDataRandom.setValue(value);
    }
    public LiveData<Integer> getDataRandom(){
        return mDataRandom;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Log.d("BBB","onCreate");
    }

}
