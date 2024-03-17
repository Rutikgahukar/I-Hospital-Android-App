package com.example.i_hospital.loginpage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.i_hospital.admin.AdminHomeActivity;
import com.example.i_hospital.masteradmin.MasterAdminDashBoard;
import com.example.i_hospital.R;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private static final String PREF_NAME = "login_pref";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String MASTER_ADMIN_USERNAME = "Master";
    private static final String MASTER_ADMIN_PASSWORD = "Master";
    private static final String ADMIN_USERNAME = "Admin";
    private static final String ADMIN_PASSWORD = "Admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);

        // Check if the user is already logged in
        if (isLoggedIn()) {
            String username = sharedPreferences.getString(KEY_USERNAME, "");
            String password = sharedPreferences.getString(KEY_PASSWORD, "");

            if (MASTER_ADMIN_USERNAME.equals(username) && MASTER_ADMIN_PASSWORD.equals(password)) {
                openHomeFragment();
            } else if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
                openAdminHomeActivity();
            }
        }
        Button loginButton = findViewById(R.id.LoginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLogin();
            }
        });
    }
    private void handleLogin() {
        // Retrieve entered username and password from EditText fields
        String enteredUsername = ((EditText) findViewById(R.id.usernameEditText)).getText().toString();
        String enteredPassword = ((EditText) findViewById(R.id.passwordEditText)).getText().toString();

        // Check if entered credentials match MasterAdmin
        if (MASTER_ADMIN_USERNAME.equals(enteredUsername) && MASTER_ADMIN_PASSWORD.equals(enteredPassword)) {
            storeCredentials(MASTER_ADMIN_USERNAME, MASTER_ADMIN_PASSWORD);
            openHomeFragment();
        }
        // Check if entered credentials match Admin
        else if (ADMIN_USERNAME.equals(enteredUsername) && ADMIN_PASSWORD.equals(enteredPassword)) {
            storeCredentials(ADMIN_USERNAME, ADMIN_PASSWORD);
            openAdminHomeActivity();
        } else {
            // Handle incorrect credentials
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }

    public void loginDocter(){



    }


    private void storeCredentials(String username, String password) {
        // Store username and password in SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_USERNAME, username);
        editor.putString(KEY_PASSWORD, password);
        editor.apply();
    }

    private boolean isLoggedIn() {
        // Check if the user is already logged in
        return sharedPreferences.contains(KEY_USERNAME) && sharedPreferences.contains(KEY_PASSWORD);
    }

    private void openHomeFragment() {
        // Open HomeFragment
        // Replace the code below with your actual navigation logic
        Intent intent = new Intent(MainActivity.this , MasterAdminDashBoard.class);
        startActivity(intent);
    }

    private void openAdminHomeActivity() {
        // Open AdminHomeActivity
        // Replace the code below with your actual navigation logic
        Intent intent = new Intent(this, AdminHomeActivity.class);
        startActivity(intent);
        finish(); // Optional: Close the current activity to prevent navigating back to it with the back button
    }
}
