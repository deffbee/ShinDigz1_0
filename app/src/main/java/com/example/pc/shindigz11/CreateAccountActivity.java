package com.example.pc.shindigz11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {

    EditText password, email, confirmPass;
    Button login;
    String emailText, passwordText, confirmPassText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        password = (EditText) findViewById(R.id.newPasswordField);
        email = (EditText) findViewById(R.id.newEmailField);
        confirmPass = (EditText) findViewById(R.id.ConfirmPassField);
        login = (Button) findViewById(R.id.bConfirm);

        emailText = email.getText().toString();
        passwordText = password.getText().toString();
        confirmPassText = confirmPass.getText().toString();




    }
}
