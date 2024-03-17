package com.example.i_hospital.masteradmin;

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
import androidx.fragment.app.FragmentManager;

import com.example.i_hospital.R;

public class MasterAdmin_BottomSheet extends AppCompatActivity {
  Button buttonAwesomeqw ;
  ImageView BackArrowInformationForm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_master_admin_bottom_sheet);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttonAwesomeqw=findViewById(R.id.NextMasterAdmin);
        buttonAwesomeqw.setOnClickListener(v -> {
            Intent intent = new Intent(MasterAdmin_BottomSheet.this, MasterAddminNext.class);
            startActivity(intent);

        });

        ImageView BackArrowInformationForm = findViewById(R.id.BackArrowInformationForm);
        BackArrowInformationForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    @Override
    public void onBackPressed() {
        // Get the FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.getBackStackEntryCount() > 0) {
            fragmentManager.popBackStack();
        } else {
            // If no fragments in the back stack, finish the activity
            super.onBackPressed();
        }
    }
}