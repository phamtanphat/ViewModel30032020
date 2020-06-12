package com.example.viewmodel30032020;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
   private MutableLiveData<String> mDataString;

    public MainViewModel() {
        this.mDataString = new MutableLiveData<>();
    }

    public void setDataString(String chuoi){
        mDataString.setValue(chuoi);
    }
    public LiveData<String> getDataString(){
        return  mDataString;
    }
}
