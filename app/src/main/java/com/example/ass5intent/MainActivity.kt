package com.example.ass5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowDetail(v: View){
        val intent = Intent (this, SecondActivity::class.java)
        val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
        intent.putExtra("stdData", Employee(edit_name.text.toString(), radio.text.toString(), edit_mail.text.toString(), edit_salary.text.toString().toInt()))
        startActivity(intent)
    }

    fun radio_button_click(view: View){



    }
    fun reset(v:View){
        edit_name.text.clear()
        edit_mail.text.clear()
        edit_salary.text.clear()
        radioGroup.clearCheck()
    }
}



