package com.example.viewmodel30032020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new MainViewModel();
        getLifecycle().addObserver(mainViewModel);
        // Observe : Pham vi lang nghe du lieu
        mainViewModel
                .getDataRandom()
                .observe(this, new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer) {
                        if (integer != null) {
                            Log.d("BBB", integer + "");
                        } else {
                            Log.d("BBB", "null");
                        }
                    }
                });
        // setListener : Call data trong main
        mainViewModel.randomNumber(10);
    }
}