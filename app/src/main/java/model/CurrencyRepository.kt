package model

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CurrencyRepository {
    val gson = GsonBuilder().apply {
        setLenient()
    }.create()
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.exchangerate.host")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val api = retrofit.create(API::class.java)

    suspend fun getUsdToRub() = api.getLatestCurrencyUsd()
    suspend fun getEurToRub() = api.getLatestCurrencyEur()
}