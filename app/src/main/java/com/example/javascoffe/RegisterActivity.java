package com.example.javascoffe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Back(View view ){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }

    public void showAlertDialog (View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Disculpe las molestias");
        builder.setMessage("En desarrollo");
        builder.show();

    }
}