package com.example.midmorningfirebasedatabase

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edtName:EditText
    lateinit var edtEmail:EditText
    lateinit var edtIdNumber:EditText
    lateinit var btnSave:Button
    lateinit var btnView:Button
    lateinit var progressDialog:ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.mEdtName)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtIdNumber = findViewById(R.id.mEdtID)
        btnSave = findViewById(R.id.mbtnSave)
        btnView = findViewById(R.id.mbtnView)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Saving")
        progressDialog.setMessage("Please wait...")
        btnSave.setOnClickListener {

        }
        btnView.setOnClickListener {

        }
    }
}