package com.example.pc.shindigz11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText passwordText, emailText;
    TextView  title, register;
    Button login;
    String email, password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        title = (TextView) findViewById(R.id.titleView);
        emailText = (EditText) findViewById(R.id.emailField);
        passwordText = (EditText) findViewById(R.id.passwordField);
        login = (Button) findViewById(R.id.bLogin);
        register = (TextView) findViewById(R.id.registerText);

        email = emailText.getText().toString();
        password = passwordText.getText().toString();

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.registerText:
                Intent intent = new Intent(this,CreateAccountActivity.class);
                    this.startActivity(intent);
                break;
            case R.id.bLogin:
        }
    }
}



