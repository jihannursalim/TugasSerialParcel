package com.example.tugasserialparcel.Parcelablee

import android.os.Parcel
import android.os.Parcelable

data class DataParcel(
    val name : String,
    val email : String,
    val phone : String,
    val address : String,
    val age : Int) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt()
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<DataParcel> {
        override fun createFromParcel(parcel: Parcel): DataParcel {
            return DataParcel(parcel)
        }

        override fun newArray(size: Int): Array<DataParcel?> {
            return arrayOfNulls(size)
        }
    }
}
