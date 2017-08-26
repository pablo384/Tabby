package com.pablo384.tabby.Models

/**
 * Created by pablo384 on 26/08/17.
 */
class Country (val name:String, val countryCode:String) {
    fun getURLCountry()= "http://www.geognos.com/api/en/countries/flag/$countryCode.png"
}