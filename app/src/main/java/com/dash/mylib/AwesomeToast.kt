package com.dash.mylib

import android.content.Context
import android.widget.Toast

object AwesomeToast {
    fun show(context: Context) {
        Toast.makeText(context, "hello", Toast.LENGTH_LONG).show()
    }
}