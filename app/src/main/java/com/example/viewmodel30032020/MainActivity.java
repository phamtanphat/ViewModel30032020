package com.example.viewmodel30032020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Observe : Pham vi lang nghe du lieu
        MainViewModel
                .getInstance()
                .getDataRandom()
                .observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                if (integer != null){
                    Log.d("BBB",integer + "");
                }else {
                    Log.d("BBB","null");
                }
            }
        });
        // setListener : Call data trong main
        MainViewModel.getInstance().randomNumber(10);
    }
}