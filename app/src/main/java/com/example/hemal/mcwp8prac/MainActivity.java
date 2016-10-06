package com.example.hemal.mcwp8prac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    EditText fname, lname, age, address, pincode, state, dob;
    RadioGroup gender, marital_status;
    RadioButton male, female, married, unmarried;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void onButtonClicked(View view){

        Intent intent = new Intent(MainActivity.this, NewActivity.class);
        intent.putExtra("firstName", fname.getText().toString());
        intent.putExtra("lastName", lname.getText().toString());
        intent.putExtra("address", address.getText().toString());
        intent.putExtra("pincode", pincode.getText().toString());
        intent.putExtra("age", age.getText().toString());
        intent.putExtra("gender", (gender.getCheckedRadioButtonId() == male.getId()) ? "Male" : "Female");
        intent.putExtra("married", (marital_status.getCheckedRadioButtonId() == married.getId()) ? "Married" : "Unmarried");
        intent.putExtra("state", state.getText().toString());
        intent.putExtra("dob", dob.getText().toString());
        startActivity(intent);

    }

    private void init(){
        fname = (EditText) findViewById(R.id.et_activity_main_first_name);
        lname = (EditText) findViewById(R.id.et_activity_main_last_name);
        age = (EditText) findViewById(R.id.et_activity_main_age);
        address = (EditText) findViewById(R.id.et_activity_main_address);
        pincode = (EditText) findViewById(R.id.et_activity_main_pincode);
        state = (EditText) findViewById(R.id.et_activity_main_state);
        dob = (EditText) findViewById(R.id.et_activity_main_dob);
        gender = (RadioGroup) findViewById(R.id.radioGroup);
        marital_status = (RadioGroup) findViewById(R.id.radioGroupMarraige);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        married = (RadioButton) findViewById(R.id.married);
        unmarried = (RadioButton) findViewById(R.id.unmarried);
    }
}
