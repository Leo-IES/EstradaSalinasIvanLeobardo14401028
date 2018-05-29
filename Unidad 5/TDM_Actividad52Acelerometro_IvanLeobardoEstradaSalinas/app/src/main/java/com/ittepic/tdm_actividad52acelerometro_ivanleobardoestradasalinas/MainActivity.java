package com.ittepic.tdm_actividad52acelerometro_ivanleobardoestradasalinas;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView1);
        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        StringBuilder data = new StringBuilder();
        for(int i=1; i<lista.size(); i++){
            data.append("X"+lista.get(i).get + "\n");
            data.append("Y"+lista.get(i).getVendor() + "\n");
            data.append("Z"+lista.get(i).getVersion() + "\n\n");
        }
        textView.setText(data);
    }
}