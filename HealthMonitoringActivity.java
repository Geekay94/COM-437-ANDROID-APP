package com.example.eldercarerobot;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class HealthMonitoringActivity extends AppCompatActivity {
    private TextView tvHeartRate;
    private TextView tvBloodPressure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_monitoring);

        tvHeartRate = findViewById(R.id.tvHeartRate);
        tvBloodPressure = findViewById(R.id.tvBloodPressure);

        // Fetch health data from the server or sensors and display
        fetchHealthData();
    }

    private void fetchHealthData() {
        // Simulate fetching data
        tvHeartRate.setText("Heart Rate: 75 bpm");
        tvBloodPressure.setText("Blood Pressure: 120/80 mmHg");
    }
}
