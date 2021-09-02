package com.example.sensortest;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager mSansorManger;
    Sensor mSensorLigth;
    TextView mTvLigth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvLigth = findViewById(R.id.tvSensorLigh);

        mSansorManger = (SensorManager) getSystemService(getApplicationContext().SENSOR_SERVICE);

        List<Sensor> sensorList = mSansorManger.getSensorList(Sensor.TYPE_ALL);

        StringBuilder sensorListTxt = new StringBuilder();

        for (Sensor s: sensorList){
            sensorListTxt.append(s.getName()).append(System.getProperty("line.separator"));
        }

        mTvLigth.setText(sensorListTxt);

    }

}