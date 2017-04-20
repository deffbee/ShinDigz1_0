package com.example.pc.shindigz11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditTextPassword, mEditTextEmail, mEditTextConfirmPass;
    Button mLogin;
    String mEmailText, mPasswordText, mConfirmPassText;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        mEditTextPassword = (EditText) findViewById(R.id.newPasswordField);
        mEditTextEmail = (EditText) findViewById(R.id.newEmailField);
        mEditTextConfirmPass = (EditText) findViewById(R.id.ConfirmPassField);
        mLogin = (Button) findViewById(R.id.bConfirm);

        mEmailText = mEditTextEmail.getText().toString();
        mPasswordText = mEditTextPassword.getText().toString();
        mConfirmPassText = mEditTextConfirmPass.getText().toString();
    }

    public final boolean isValidEmail(String isGoodEmail) {
        if (isGoodEmail!= null && android.util.Patterns.EMAIL_ADDRESS.matcher(isGoodEmail).matches())
        {
            return true;
        } else {
            mEditTextEmail.setError(getResources().getString(R.string.email_error));
            return false;
        }
    }

    public final boolean isValidPassword(String isGoodPassword, String isGoodConPassword) {

        if (isGoodPassword == isGoodConPassword) {

            if (isGoodPassword != null && isGoodPassword.length() > 8) {
                return true;
            }
            else {
                mEditTextPassword.setError(getResources().getString(R.string.bad_password));
                return false;
            }

        }
        else {
            mEditTextPassword.setError(getResources().getString(R.string.non_matching_pass));
            return false;
        }
    }

    @Override
    public void onClick(View v) {

        //if (isValidEmail(mEmailText) && isValidPassword(mPasswordText, mConfirmPassText)) {

        }

}



