package com.ato.fragmentscheck.cardsFragment3x30x4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.ato.fragmentscheck.R
import com.ato.fragmentscheck.cardsFragment3x30x4nofragments.CardFragmentAdapter
import com.ato.fragmentscheck.cardsFragment3x30x4nofragments.SliderTransformer

class Activity3x30x4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val limit = 30
        findViewById<ViewPager2>(R.id.viewPagerTop).apply {
            adapter = CardFragmentAdapter(this@Activity3x30x4)
            setPageTransformer(SliderTransformer(limit))
            offscreenPageLimit = limit
        }
        findViewById<ViewPager2>(R.id.viewPagerMiddle).apply {
            adapter = CardFragmentAdapter(this@Activity3x30x4)
            setPageTransformer(SliderTransformer(limit))
            offscreenPageLimit = limit
        }
        findViewById<ViewPager2>(R.id.viewPagerBottom).apply {
            adapter = CardFragmentAdapter(this@Activity3x30x4)
            setPageTransformer(SliderTransformer(limit))
            offscreenPageLimit = limit
        }
    }
}