package model

import model.data.Currency
import retrofit2.http.GET

interface API {
    @GET("/convert?from=USD&to=RUB")
    suspend fun getLatestCurrencyUsd(): Currency

    @GET("/convert?from=EUR&to=RUB")
    suspend fun getLatestCurrencyEur(): Currency
}