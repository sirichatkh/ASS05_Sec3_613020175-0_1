package com.example.ass5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var newEmp = data?.getParcelable<Employee>("stdData")
        nameText.text = "Employee Name: ${newEmp?.name}"
        genderText.text = "Gender : ${newEmp?.gender}"
        mailText.text = "E-mail : ${newEmp?.mail}"
        salaryText.text ="Salary : ${newEmp?.salary}"
    }


    fun onClickClose(view: View){
        finish()
    }
}