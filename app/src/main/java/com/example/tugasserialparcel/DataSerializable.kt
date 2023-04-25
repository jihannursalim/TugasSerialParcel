package com.example.tugasserialparcel

data class DataSerializable(
    val name : String,
    val email : String,
    val phone : String,
    val address : String,
    val age : Int
) : java.io.Serializable
