package com.integral.matrix;

import static com.integral.matrix.R.id.EmailValidation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msgText;
    EditText emailInput, passwordInput;
    Button loginBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msgText = findViewById(R.id.EmailValidation);
        emailInput = findViewById(R.id.Email);
        passwordInput = findViewById(R.id.Password);

        loginBtn = findViewById(R.id.LoginBTN);


        loginBtn.setOnClickListener(
                v -> {
                    String email = String.valueOf(emailInput.getText());
                    String password = String.valueOf(passwordInput.getText());





                    if ((password.length() < 6  ) || (email.length()< 4 || !email.contains("@") )  ) {
                        msgText.setText("FUCK YOU YOUR PASSWORD IS NOT ENOUGH JUST LIKE YOU");

                        return;
                    }


                     msgText.setText("YOUR ARE FUCKING GREAT!");

                }
        );

    }
}