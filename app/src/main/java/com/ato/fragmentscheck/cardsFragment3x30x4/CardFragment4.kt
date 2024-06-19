package com.ato.fragmentscheck.cardsFragment3x30x4

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ato.fragmentscheck.R
import kotlin.random.Random


class CardFragment4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_card_4, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val color = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        view.setBackgroundColor(color)


    }
}
