package com.example.pc.shindigz11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {

    EditText password, email, confirmPass;
    Button login;
    String emailText, passwordText, confirmPassText;
    Intent intent;

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

        public final boolean isValidEmail(String emailText) {

       if (emailText != null && android.util.Patterns.EMAIL_ADDRESS.matcher(emailText).matches())
       {
           return true;
       }
       else
       {
         email   (getResources().getString(R.string.email_error));
       }





    }

    @Override
    public void onClick(View v) {

        if (email, password, )
        }
    }
}
