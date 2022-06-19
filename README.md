# Ex.No: 8
# Build a program to show five checkboxes and toast selected checkboxes.

## AIM:

To create a list using checkbox to display selected checkbox item using Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Min.required Arctic Fox)

## ALGORITHM:

Step 1: Open Android Studio and then click on File -> New -> New project.

Step 2: Then type the Application name as "check" and click Next. 

Step 3: Then select the Empty Activity and click Next. Finally click Finish.

Step 4: Design layout using UI components in activity_main.xml.

Step 5: Display the list using checkbox in MainActivity file.

Step 6: Launch an emulator and run the application.

## PROGRAM:
```
/*
Program to display "check list item”.
Developed by        : S.Dinesh
Registration Number : 212220230011
*/
```
#### MainActivity.java
```
package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkFrance, chkSwiss, chkMumbai, chkUS, chkMaldives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkFrance = findViewById(R.id.chkFrance);
        chkSwiss = findViewById(R.id.chkSwiss);
        chkMumbai = findViewById(R.id.chkMumbai);
        chkUS = findViewById(R.id.chkUS);
        chkMaldives = findViewById(R.id.chkMaldives);
    }
    public void showSelected(View view) {

        String selected = "You selected: \n";

        if(chkFrance.isChecked())
            selected += "France";

        if(chkSwiss.isChecked())
            selected += "\nSwitzerland";

        if(chkMumbai.isChecked())
            selected += "\nMumbai";

        if(chkUS.isChecked())
            selected += "\nCalifornia";

        if(chkMaldives.isChecked())
            selected += "\nMaldives";

        Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
    }
}
```
#### activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:text="Select your favorite place"
        style="@style/TextAppearance.AppCompat.Large"
        android:layout_margin="10dp"
        android:textStyle="bold"/>

    <CheckBox
        android:id="@+id/chkFrance"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="France"
        style="@style/TextAppearance.AppCompat.Headline"/>

    <CheckBox
        android:id="@+id/chkSwiss"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Switzerland"
        style="@style/TextAppearance.AppCompat.Headline"/>

    <CheckBox
        android:id="@+id/chkMumbai"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Mumbai"
        style="@style/TextAppearance.AppCompat.Headline"/>

    <CheckBox
        android:id="@+id/chkUS"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="California"
        style="@style/TextAppearance.AppCompat.Headline"/>

    <CheckBox
        android:id="@+id/chkMaldives"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Maldives"
        style="@style/TextAppearance.AppCompat.Headline"/>

    <Button android:id="@+id/btnDisplay"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Display"
        android:layout_marginTop="20dp"
        android:onClick="showSelected"/>

</LinearLayout>
```

## OUTPUT:
![place](https://user-images.githubusercontent.com/75235813/173172545-eecd3c71-ca36-4aa1-98fb-b1b0202fbaad.jpeg)

![place1](https://user-images.githubusercontent.com/75235813/173172550-04657158-e6c9-4b97-815e-c520ac1ea251.jpeg)


## RESULT:
Thus a Simple Android Application to create a list using checkbox to display selected checkbox using Android Studio is developed and executed successfully.
