package com.example.viewmodel30032020;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainViewModel extends ViewModel {
    private static MainViewModel viewModel = null;
    private MutableLiveData<Integer> mDataRandom;

    public MainViewModel() {
        this.mDataRandom = new MutableLiveData<>();
    }
    public static MainViewModel getInstance(){
        if (viewModel == null){
            viewModel = new MainViewModel();
        }
        return viewModel;
    }

    public void randomNumber(int bound){
        Random random = new Random();
        int value = random.nextInt(bound);
        mDataRandom.setValue(value);
    }
    public LiveData<Integer> getDataRandom(){
        return mDataRandom;
    }

}
