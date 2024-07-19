package com.example.eldercarerobot;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnHealthMonitoring;
    private Button btnMedicationReminders;
    private Button btnEmergency;
    private Button btnCompanionChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHealthMonitoring = findViewById(R.id.btnHealthMonitoring);
        btnMedicationReminders = findViewById(R.id.btnMedicationReminders);
        btnEmergency = findViewById(R.id.btnEmergency);
        btnCompanionChat = findViewById(R.id.btnCompanionChat);

        btnHealthMonitoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HealthMonitoringActivity.class);
                startActivity(intent);
            }
        });

        btnMedicationReminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MedicationReminderActivity.class);
                startActivity(intent);
            }
        });

        btnEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EmergencyActivity.class);
                startActivity(intent);
            }
        });

        btnCompanionChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CompanionChatActivity.class);
                startActivity(intent);
            }
        });
    }
}
