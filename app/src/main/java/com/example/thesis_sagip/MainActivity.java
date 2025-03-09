package com.example.thesis_sagip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        CardView GoToRescuerRegister = findViewById(R.id.register_rescue);
        CardView GoToHospitalRegister = findViewById(R.id.hospital_register);
        CardView GoToBarangayRegister = findViewById(R.id.brgy_register);
        Button SubmitButton = findViewById(R.id.cont_btn);

        GoToRescuerRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register_Rescuer_Page.class);
                startActivity(intent);
            }
        });

        GoToHospitalRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Hospital_Register_Page.class);
                startActivity(intent);
            }
        });

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register_Senior_Page.class);
                startActivity(intent);
            }
        });
        GoToBarangayRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Barangay_Registration.class);
                startActivity(intent);
            }
        });
    }
}