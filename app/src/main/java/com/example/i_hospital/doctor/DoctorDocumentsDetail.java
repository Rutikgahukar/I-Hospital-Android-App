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

public class DoctorDocumentsDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor_documents_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button DocumentNext = findViewById(R.id.DocumentNext);
        DocumentNext.setOnClickListener(v -> {
            Intent intent = new Intent(DoctorDocumentsDetail.this, DocotorAccountDetail.class);
            startActivity(intent);
        });
        Button DocumentBack = findViewById(R.id.DocumentBack);
        DocumentBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorDocumentsDetail.this, DoctorNextQualification.class);
                startActivity(intent);
            }
        });
        ImageView DocumentBackimageView = findViewById(R.id.DocumentBackimageView);
        DocumentBackimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorDocumentsDetail.this, DoctorNextQualification.class);
                startActivity(intent);
            }
        });
    }
}