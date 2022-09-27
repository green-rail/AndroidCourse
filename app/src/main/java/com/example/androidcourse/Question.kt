package com.example.androidcourse

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean) {
}
