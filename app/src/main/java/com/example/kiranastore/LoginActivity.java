package com.example.kiranastore;

import android.content.Context;
import android.content.Intent;

import com.indus.apiFunction.ApiMethod;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    private EditText editAadharNumber;
    private Button loginButton;
    private String loginResponse,aadharNumString,desc;
    ApiMethod apiMethod=new ApiMethod();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editAadharNumber=findViewById(R.id.inputAadhar);
        loginButton=findViewById(R.id.loginButton);
    }

    public void signin(View view) {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                aadharNumString=editAadharNumber.getText().toString();
//                loginResponse=apiMethod.login(aadharNumString);
//                JSONObject reader= null;
//                try {
//                    reader = new JSONObject(loginResponse);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    desc= reader.getJSONObject("Description").toString();
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
            }
        });
    }
}
