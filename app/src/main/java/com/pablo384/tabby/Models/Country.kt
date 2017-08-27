package com.pablo384.tabby.Models

/**
 * Created by pablo384 on 26/08/17.
 */
class Country (val name:String) {
    fun getURLCountry()= "http://www.geognos.com/api/en/countries/flag/${getCountryCode(name)}.png"
    fun getCountryCode(country:String):String{
        when(country){
            "Republica Dominicana" -> return "DO"
            "España" -> return "ES"
            "Argentina" -> return "AR"
            "Bolivia"-> return "BO"
            "Chile"->return "CL"
            "Colombia"-> return "CO"
            "Ecuador"->return "EC"
            "Mexico"-> return "MX"
            "Perú"->return "PE"
            "Uruguay"-> return "UY"
            "Venezuela"-> return "VE"
            else -> return "DO"
        }
    }
}