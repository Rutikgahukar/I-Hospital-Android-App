package com.example.i_hospital.Bill;

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

public class BillEntryeExpenseAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bill_entrye_expense_add);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView BillentryBackimageView = findViewById(R.id.BillentryBackimageView);
        BillentryBackimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BillEntryeExpenseAdd.this, MasterAdminDashBoard.class);
                startActivity(intent);
            }
        });

        Button BillButtonNext = findViewById(R.id.BillButtonNext);
        BillButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BillEntryeExpenseAdd.this, BillNextPayment.class);
                startActivity(intent);
            }
        });
    }
}