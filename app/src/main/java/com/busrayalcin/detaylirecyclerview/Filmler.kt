package com.busrayalcin.detaylirecyclerview

import java.io.Serializable

data class Filmler(var filmId:Int,
                   var filmAdi:String,
                   var filminResimAdi:String,
                   var filmYil:Int,
                   var filmFiyat:Double,
                   var filmYonetmen:String) : Serializable{
}