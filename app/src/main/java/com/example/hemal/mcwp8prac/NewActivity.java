package com.example.hemal.mcwp8prac;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by hemal on 6/10/16.
 */
public class NewActivity extends AppCompatActivity{

    TextView tfname, tlname, taddress, tstate, tpincode, tgender, tage, tdob, tmarried;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        init();

        Intent incomingIntent = getIntent();
        tage.setText(incomingIntent.getStringExtra("age"));
        tfname.setText(incomingIntent.getStringExtra("firstName"));
        tlname.setText(incomingIntent.getStringExtra("lastName"));
        tpincode.setText(incomingIntent.getStringExtra("pincode"));
        taddress.setText(incomingIntent.getStringExtra("address"));
        tgender.setText(incomingIntent.getStringExtra("gender"));
        tmarried.setText(incomingIntent.getStringExtra("married"));
        tstate.setText(incomingIntent.getStringExtra("state"));
        tdob.setText(incomingIntent.getStringExtra("dob"));
    }

    private void init() {
        tage = (TextView) findViewById(R.id.age);
        tfname = (TextView) findViewById(R.id.fname);
        tlname = (TextView) findViewById(R.id.lname);
        tpincode = (TextView) findViewById(R.id.pincode);
        taddress = (TextView) findViewById(R.id.address);
        tstate = (TextView) findViewById(R.id.state);
        tgender = (TextView) findViewById(R.id.gender);
        tdob = (TextView) findViewById(R.id.dob);
        tmarried = (TextView) findViewById(R.id.married);
    }
}
