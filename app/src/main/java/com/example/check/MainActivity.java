package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkKTM, chkHonda, chkRoyal, chkRM5, chkGlamour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkKTM = findViewById(R.id.chkKTM);
        chkHonda = findViewById(R.id.chkHonda);
        chkRoyal = findViewById(R.id.chkRoyal);
        chkRM5 = findViewById(R.id.chkRM5);
        chkGlamour = findViewById(R.id.chkGlamour);
    }
    public void showSelected(View view) {

        String selected = "You selected: \n";

        if(chkKTM.isChecked())
            selected += "\nKTM";

        if(chkHonda.isChecked())
            selected += "\nHonda";

        if(chkRoyal.isChecked())
            selected += "\nRoyal";

        if(chkRM5.isChecked())
            selected += "\nRM5";

        if(chkGlamour.isChecked())
            selected += "\nGlamour";

        Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
    }
}