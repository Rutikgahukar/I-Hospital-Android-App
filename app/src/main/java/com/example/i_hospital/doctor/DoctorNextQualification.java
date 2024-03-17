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

import com.example.i_hospital.R;

public class DoctorNextQualification extends AppCompatActivity {
Button DoctorPrevious ,DoctorNext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor_next_qualification);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        DoctorPrevious= findViewById(R.id.DoctorPrevious);
        DoctorPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorNextQualification.this, DoctorActivity.class);
                startActivity(intent);
            }
        });
        DoctorNext=findViewById(R.id.DoctorNext);
        DoctorNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorNextQualification.this, DoctorDocumentsDetail.class);
                startActivity(intent);
            }
        });
        ImageView NextQualificationBack = findViewById(R.id.NextQualificationBack);
        NextQualificationBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorNextQualification.this,DoctorActivity.class);
                startActivity(intent);
            }
        });
    }
}