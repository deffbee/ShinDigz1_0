package com.example.pc.shindigz11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//This is the Launcher Activity
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditTextPassword, mEditTextEmail;
    TextView mTextViewTitle, mTextViewRegister;
    Button mButtonLogin;
    Intent intent;
    String email, password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mTextViewTitle = (TextView) findViewById(R.id.titleView);
        mEditTextEmail = (EditText) findViewById(R.id.emailField);
        mEditTextPassword = (EditText) findViewById(R.id.passwordField);
        mButtonLogin = (Button) findViewById(R.id.bLogin);
        mTextViewRegister = (TextView) findViewById(R.id.registerText);

        //assigning input email/password text to string value
        email = mEditTextEmail.getText().toString();
        password = mEditTextPassword.getText().toString();

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.registerText:
                intent = new Intent(this, CreateAccountActivity.class);
                this.startActivity(intent);
                break;
            case R.id.bLogin:
                break;
        }
    }
}



