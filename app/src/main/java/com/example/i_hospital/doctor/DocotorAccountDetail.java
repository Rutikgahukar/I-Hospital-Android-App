package com.example.i_hospital.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.i_hospital.R;

public class DocotorAccountDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_docotor_account_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button DoctorAccountSubmit = findViewById(R.id.DoctorAccountSubmit);
        DoctorAccountSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DocotorAccountDetail.this, "Submit", Toast.LENGTH_SHORT).show();
            }
        });
        Button PreviousDoctorAccount = findViewById(R.id.PreviousDoctorAccount);
        PreviousDoctorAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocotorAccountDetail.this, DoctorDocumentsDetail.class);
                startActivity(intent);
            }
        });
         ImageView AccountBackDoctor = findViewById(R.id.AccountBackDoctor);
        AccountBackDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocotorAccountDetail.this,DoctorDocumentsDetail.class);
                startActivity(intent);
            }
        });
    }
}