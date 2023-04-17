package com.example.myapplicationsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("mail", ""));
    }

    ///Método para el botón guardar///
    public void guardar (View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferences.edit();
        Obj_editor.putString("mail", et1.getText().toString());
        Obj_editor.commit();
        finish();

    }

}