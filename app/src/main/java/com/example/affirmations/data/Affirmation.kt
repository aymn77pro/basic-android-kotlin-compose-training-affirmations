package com.example.affirmations.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
   @StringRes val text:Int,
   @DrawableRes val image:Int
)