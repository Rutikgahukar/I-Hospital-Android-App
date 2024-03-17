package com.example.i_hospital.staff;

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

public class StaffNextAccountDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_staff_next_account_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_next_staff), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView StaffBackArrowMasterForm = findViewById(R.id.StaffBackArrowMasterForm);
        StaffBackArrowMasterForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StaffNextAccountDetail.this, StaffNextQualification.class);
                startActivity(intent);
            }
        });

        Button buttonSumit = findViewById(R.id.StaffbuttonSumit);
        buttonSumit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StaffNextAccountDetail.this, "Submit", Toast.LENGTH_SHORT).show();
            }
        });
        Button StaffsbuttonPrevious = findViewById(R.id.StaffsbuttonPrevious);
        StaffsbuttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StaffNextAccountDetail.this, StaffNextQualification.class);
                startActivity(intent);
            }
        });
    }
}