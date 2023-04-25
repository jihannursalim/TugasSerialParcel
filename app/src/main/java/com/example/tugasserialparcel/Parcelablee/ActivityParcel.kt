package com.example.tugasserialparcel.Parcelablee

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasserialparcel.R
import com.example.tugasserialparcel.databinding.ActivityParcelBinding

class ActivityParcel : AppCompatActivity() {

    lateinit var binding: ActivityParcelBinding

    @SuppressLint("NewApi", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDataParcel = intent.getParcelableExtra("DataParcel", ActivityParcel::class.java) as DataParcel
        val nama = getDataParcel.name
        val email = getDataParcel.email
        val tlp = getDataParcel.phone
        val alamat = getDataParcel.address
        val umur = getDataParcel.age

        binding.txtName.text = "Nama : $nama"
        binding.txtEmail.text = "Email : $email"
        binding.txtPhone.text = "Phone : $tlp"
        binding.txtAddress.text = "Address : $alamat"
        binding.txtAge.text = "Age : $umur"
    }
}