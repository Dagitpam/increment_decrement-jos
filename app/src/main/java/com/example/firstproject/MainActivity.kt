package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter  :  Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var displayText: TextView = findViewById(R.id.tv_display_result)
        var decrementButton : Button = findViewById(R.id.bt_decrement)
        var incrementButton : Button = findViewById(R.id.bt_increment)
        var resetButton : Button = findViewById(R.id.bt_reset)

        decrementButton.setOnClickListener(View.OnClickListener {
            counter = counter - 1;
            displayText.setText(""+counter)

        })
        incrementButton.setOnClickListener(View.OnClickListener {

            counter = counter + 1;
            displayText.setText(""+counter)
        })
        resetButton.setOnClickListener(View.OnClickListener {
            counter = 0;
            displayText.setText(""+counter)
        })
    }
}
