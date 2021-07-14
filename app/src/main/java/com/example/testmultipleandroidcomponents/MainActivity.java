package com.example.testmultipleandroidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, RatingBar.OnRatingBarChangeListener, RadioGroup.OnCheckedChangeListener {
    private CheckBox checkBox1, checkBox2, checkBox3;
    private SeekBar mSeekBar;
    private RatingBar mRatingBar;
    private RadioButton radioButton1, radioButton2, radioButton3;
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);

        mSeekBar = findViewById(R.id.seekBar);
        mSeekBar.setOnSeekBarChangeListener(this);

        mRatingBar = findViewById(R.id.ratingBar);
        mRatingBar.setOnRatingBarChangeListener(this);

        mRadioGroup = findViewById(R.id.radioGroup);

        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        mRadioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        switch (compoundButton.getId()) {
            case R.id.checkBox:
                if(isChecked) {
                    Toast.makeText(getApplicationContext(), "JUDO", Toast.LENGTH_SHORT).show();
                } break;
            case R.id.checkBox2:
                if(isChecked) {
                    Toast.makeText(getApplicationContext(), "KARATE", Toast.LENGTH_SHORT).show();
                } break;
            case R.id.checkBox3:
                if(isChecked) {
                    Toast.makeText(getApplicationContext(), "BOXING", Toast.LENGTH_SHORT).show();
                } break;
            case R.id.checkBox4:
                if(isChecked) {
                    Toast.makeText(getApplicationContext(), "SWIMMING", Toast.LENGTH_SHORT).show();
                } break;

        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(fromUser) {
            Toast.makeText(getApplicationContext(), progress + "", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(), "Seeking starts here", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(), "Seeking stops here", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if(fromUser) {
            Toast.makeText(getApplicationContext(), rating + "", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.radioButton:
                Toast.makeText(getApplicationContext(), "Cloud Engineer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(getApplicationContext(), "Mobile developer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3:
                Toast.makeText(getApplicationContext(), "Web developer", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}