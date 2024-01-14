package com.example.convertdataclasstojson

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import com.example.convertdataclasstojson.databinding.ActivityMainBinding
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    lateinit var user1GsonStr : String
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val job = Job(1, "engineer")
        val favorite1 = Favorites(1, "candy")
        val favorites2 = Favorites(2, "cake")

        val user1 = User(1, "xung", job, listOf(favorite1, favorites2))

        val gson = Gson()
        user1GsonStr = gson.toJson(user1)
        val userData = gson.fromJson(user1GsonStr, User::class.java)
        binding.user  = userData

    }
}