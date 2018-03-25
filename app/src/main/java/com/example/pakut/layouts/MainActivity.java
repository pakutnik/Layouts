package com.example.pakut.layouts;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {
        CheckBox checkBox = findViewById(R.id.checkBox);
        EditText editText = findViewById(R.id.editText);

        if(editText.getText().length() == 0){
            showDialog("Please enter your email");
        } else if(!checkBox.isChecked()){
            showDialog("Check it out");
        } else{
            Intent intent = new Intent(MainActivity.this, MessageActivity.class);
            intent.putExtra("message", editText.getText().toString());
            startActivity(intent);
        }
    }

    public void showDialog(String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Notice!")
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
