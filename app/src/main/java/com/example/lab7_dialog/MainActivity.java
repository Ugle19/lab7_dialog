package com.example.lab7_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCloseButtonClick(View view)
    {
        AlertDialog.Builder bl = new AlertDialog.Builder(MainActivity.this);
        bl.setTitle("Выход из приложения")
                .setIcon(R.drawable.image_close)
                .setMessage("Вы уверены, что хотите закрыть приложение?")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("OТМЕНА",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alert = bl.create();
        alert.show();
    }
}