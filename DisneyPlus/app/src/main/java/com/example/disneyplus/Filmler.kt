package com.example.disneyplus

import java.io.Serializable

data class Filmler(var filmId:Int,
              var filmAdi:String,
              var filmResimAdi:String) : Serializable {
}