package ro.alexmamo.recognizetextinimages.components

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ro.alexmamo.recognizetextinimages.core.Constants

@Composable
fun ProgressBar() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        CircularProgressIndicator()
    }
}

class Utils {
    companion object {
        fun print(e: Exception?) = e?.apply {
            Log.e(Constants.TAG, stackTraceToString())
        }
    }
}