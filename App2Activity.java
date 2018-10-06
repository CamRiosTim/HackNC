package com.example.android.myfirst;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class App2Activity extends Activity {

    Button button;
    
     @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView instr = findViewById(R.id.instructionsText);
        // final EditText ed1 = findViewById(R.id.usernameTextBox);

        instr.setText("Welcome to our NFL statistics database. You can " +
                "search by team, or by individual player. Swipe right to " +
                "view league leaders. Enjoy!");
    }

}
