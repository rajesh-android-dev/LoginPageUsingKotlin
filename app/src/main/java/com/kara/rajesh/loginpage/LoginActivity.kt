package com.kara.rajesh.loginpage

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener(View.OnClickListener {
            performLogin()
        })

    }


       private fun performLogin() {
        if (!TextUtils.isEmpty(etUsername.text.toString()) && !TextUtils.isEmpty(etPassword.text.toString())) {
            val successAlert = AlertDialog.Builder(this).create()
            successAlert.setTitle("Success")
            successAlert.setMessage("Logged in Successfully")
            successAlert.setButton(AlertDialog.BUTTON_POSITIVE,"OK",{
                dialogInterface, i ->
                Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
            })
            successAlert.show()
        } else {
            Toast.makeText(this, "Please eneter all the values", Toast.LENGTH_SHORT).show()
        }
    }
}
