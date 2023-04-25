package com.example.tugasserialparcel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.tugasserialparcel.Parcelablee.ActivityParcel
import com.example.tugasserialparcel.Parcelablee.DataParcel
import com.example.tugasserialparcel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val etname = findViewById<EditText>(R.id.etName)
            val etemail = findViewById<EditText>(R.id.etEmail)
            val etphone = findViewById<EditText>(R.id.etPhone)
            val etaddress = findViewById<EditText>(R.id.etAddress)
            val etage = findViewById<EditText>(R.id.etAge)

            val name = etname.text.toString()
            val email = etemail.text.toString()
            val phone = etphone.text.toString()
            val address = etaddress.text.toString()
            val age = etage.text.toString().toInt()

            val dataSeri = DataSerializable(name, email, phone,address, age )
            val move = Intent(this, ActivityDua::class.java)
            move.putExtra("DataSeri", dataSeri)
            startActivity(move)
        }

        binding.btnSaveParcel.setOnClickListener {

            val etname = findViewById<EditText>(R.id.etName)
            val etemail = findViewById<EditText>(R.id.etEmail)
            val etphone = findViewById<EditText>(R.id.etPhone)
            val etaddress = findViewById<EditText>(R.id.etAddress)
            val etage = findViewById<EditText>(R.id.etAge)

            val name = etname.text.toString()
            val email = etemail.text.toString()
            val phone = etphone.text.toString()
            val address = etaddress.text.toString()
            val age = etage.text.toString().toInt()

            val intent = Intent(this, ActivityParcel::class.java)
            val dataParcel = DataParcel(name, email, phone, address, age)
            intent.putExtra("DataParcel", dataParcel)
            startActivity(intent)
        }
    }
}