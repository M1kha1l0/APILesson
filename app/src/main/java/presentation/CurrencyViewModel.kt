package presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import model.CurrencyRepository

class CurrencyViewModel : ViewModel() {

    var usd by mutableStateOf(0f)
    var eur by mutableStateOf(0f)
    val repository = CurrencyRepository()

    init {
        fetchRates()
    }

    fun fetchRates() {
        CoroutineScope(Dispatchers.IO).launch {
            usd = repository.getUsdToRub().result.toFloat()
            eur = repository.getEurToRub().result.toFloat()
        }
    }
}