package com.example.kiranastore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private ImageView accountUser;
    private LinearLayout pay,withdraw,passbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accountUser=findViewById(R.id.Account);
        pay=findViewById(R.id.transferPay);
        withdraw=findViewById(R.id.withdraw);
        passbook=findViewById(R.id.balance);
    }

    public void rechargePrepaid(View view) {

    }

    public void rechargePostpaid(View view) {
    }

    public void rechargeElectricity(View view) {

    }

    public void billDeposit(View view) {

    }

    public void billDTH(View view) {

    }

    public void billGas(View view) {

    }

    public void billInsurance(View view) {

    }

    public void billWater(View view) {
    }

    public void billLoan(View view) {

    }

    public void savingsAccount(View view) {

    }

    public void cashWithdraw(View view) {

    }

    public void payment(View view) {

    }

    public void userAccount(View view) {
        accountUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountIntent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(accountIntent);
            }
        });
    }
}
