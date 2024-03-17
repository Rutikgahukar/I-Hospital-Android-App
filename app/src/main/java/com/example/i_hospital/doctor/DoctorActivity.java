package com.example.i_hospital.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.i_hospital.masteradmin.MasterAdminDashBoard;
import com.example.i_hospital.R;

public class DoctorActivity extends AppCompatActivity {
    Button DoctorRegistrationNext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.doctor_main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        DoctorRegistrationNext= findViewById(R.id.DoctorRegistrationNext);
        DoctorRegistrationNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorActivity.this, DoctorNextQualification.class);
                startActivity(intent);
            }
        });
        ImageView DoctorRegistrtionBack = findViewById(R.id.DoctorRegistrtionBack);
        DoctorRegistrtionBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent= new Intent(DoctorActivity.this, MasterAdminDashBoard.class);
               startActivity(intent);
            }
        });
    }

}