package com.example.viewmodel30032020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;
    Button mBtnGetData;
    TextView mTvText;
    EditText mEdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnGetData = findViewById(R.id.buttonGetData);
        mTvText = findViewById(R.id.textview);
        mEdt = findViewById(R.id.edittext);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        //observer : lay du lieu
        mainViewModel.getDataString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s != null){
                    mTvText.setText(s);
                }
            }
        });
        //setListener
        mBtnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = mEdt.getText().toString();
                mainViewModel.setDataString(value);
            }
        });

    }
}