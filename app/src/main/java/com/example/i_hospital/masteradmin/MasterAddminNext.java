package com.example.i_hospital.masteradmin;

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

public class MasterAddminNext extends AppCompatActivity {
   ImageView BackArrowMasterForm ;
   Button buttonSumit ,buttonPrevious ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_master_addmin_next);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_next), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        BackArrowMasterForm = findViewById(R.id.BackArrowMasterForm);
        BackArrowMasterForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterAddminNext.this, MasterAdminDashBoard.class);
                startActivity(intent);
            }
        });
        buttonSumit= findViewById(R.id.buttonSumit);
        buttonSumit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MasterAddminNext.this, "Submit", Toast.LENGTH_SHORT).show();
            }
        });
        buttonPrevious= findViewById(R.id.buttonPrevious);
        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterAddminNext.this, MasterAdmin_BottomSheet.class);
                startActivity(intent);
            }
        });
    }
}
