package com.magician.bindingadapter

import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

data class User(
    val name: String,
    val imageId: Int
) {

}

@BindingAdapter("android:imageUrl")
fun loadImage(view: ImageView, imageId: Int) {
    view.setImageDrawable(ContextCompat.getDrawable(view.context, imageId))
}