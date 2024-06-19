package com.ato.fragmentscheck

import android.view.View
import androidx.viewpager2.widget.ViewPager2

class CardStackTransformer : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.apply {
            val scaleFactor = 0.85f + (1 - Math.abs(position)) * 0.15f
            when {
                position < -1 -> {
                    // Эта страница далеко сверху.
                    alpha = 0f
                }
                position <= 1 -> {
                    // Измените масштаб страницы (на основе позиции)
                    scaleX = scaleFactor
                    scaleY = scaleFactor
                    translationY = position * height
                    alpha = 0.5f + (1 - Math.abs(position)) * 0.5f
                }
                else -> {
                    // Эта страница далеко снизу.
                    alpha = 0f
                }
            }
        }
    }
}