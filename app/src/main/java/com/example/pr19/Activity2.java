package com.example.pr19;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
public class Activity2 extends AppCompatActivity {

    private Button mButtonOpenDialog;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void showDialog(View v) {

        CustDialogFragment dialog = new CustDialogFragment();
        dialog.show(getSupportFragmentManager(), "custom");
    }
}
