package com.example.convertdataclasstojson

data class User(
    val id:Int,
    val name:String,
    val job: Job,
    val favorites: List<Favorites>
)
