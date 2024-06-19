package com.ato.fragmentscheck.cardsFragment3x30x4

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ato.fragmentscheck.R
import kotlin.random.Random


class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflate = inflater.inflate(R.layout.fragment_blank, container, false)
        val textView = inflate.findViewById<TextView>(R.id.blank_text)
        val position = Random.nextInt(1000)
        textView.text = "Fragment #$position"
        return inflate
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val color = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        view.setBackgroundColor(color)


    }

}