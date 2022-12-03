package com.example.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Program Flow
        // 1- YOu have DB
        //2 - You have data inserted in DB on sign-up module
        //3- Create an instance of DB helper
        //4-that DB helpler contains validate function of flow like

        /* 5- 
        args = listOf<String>(nameEditText,passwordEditText).toTypedArray()
        query = rawQuery(SELECT * from TABLE_NAME WHERE USERNAME = ? AND PASSWORD = ? , args)
        Then return true fromm validate function
         */
    }
}