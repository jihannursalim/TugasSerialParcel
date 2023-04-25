package com.example.tugasserialparcel

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasserialparcel.databinding.ActivityDuaBinding

@Suppress("DEPRECATION")
class ActivityDua : AppCompatActivity() {

    lateinit var binding : ActivityDuaBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get Data
        val getDataSerial = intent.getSerializableExtra("DataSerial") as DataSerializable
        val nama = getDataSerial.name
        val email = getDataSerial.email
        val tlp = getDataSerial.phone
        val alamat = getDataSerial.address
        val umur = getDataSerial.age

        binding.txtName.text = "Nama : $nama"
        binding.txtEmail.text = "Email : $email"
        binding.txtPhone.text = "Phone : $tlp"
        binding.txtAddress.text = "Address : $alamat"
        binding.txtAge.text = "Age : $umur"
    }
}