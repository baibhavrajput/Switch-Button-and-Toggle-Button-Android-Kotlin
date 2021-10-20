package com.example.switchbuttonandtogglebuton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                textView.text = "Toggle Button is ON"
            }else{
                textView.text = "Toggle Button is OFF"
            }
        }
        switchButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                textView.text = "Switch Button is ON"
            }else{
                textView.text = "Switch Button is OFF"
            }
        }
    }
}