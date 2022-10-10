package presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CurrencyScreen(viewModel: CurrencyViewModel = viewModel()) {

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier =  Modifier.padding(vertical = 16.dp)) {
        Text(text = "1usd = ${viewModel.usd}rub", style = MaterialTheme.typography.h4)
        Text(text = "1eur = ${viewModel.eur}rub", style = MaterialTheme.typography.h4)
    }
}