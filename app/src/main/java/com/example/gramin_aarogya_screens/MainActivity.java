package com.example.gramin_aarogya_screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        Button SignUpAadhar, Splash_Screen, SignUpMobile, Login;
        Splash_Screen = findViewById(R.id.splashScreen);
        SignUpAadhar = findViewById(R.id.signUpAadhar);
        Login = findViewById(R.id.login);
        SignUpMobile = findViewById(R.id.signUpMobile);
        Intent press = new Intent(MainActivity.this, SplashScreenActivity.class);
        Splash_Screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(press);
            }
        });

        Intent signup = new Intent(MainActivity.this, SignUpAadhar.class);
        SignUpAadhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(signup);
            }
        });

        Intent signup2 = new Intent(MainActivity.this, SignUpMobile.class);
        SignUpMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(signup2);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Login.class));
            }
        });
    }
}
