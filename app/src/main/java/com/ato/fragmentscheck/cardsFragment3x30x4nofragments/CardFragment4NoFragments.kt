package com.ato.fragmentscheck.cardsFragment3x30x4nofragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ato.fragmentscheck.R
import kotlin.random.Random

class CardFragment4NoFragments : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_card_4_no_fragments, container, false)

        view.findViewById<TextView>(R.id.container1).apply {
            text = "${Random.nextInt(1000)}"
            val color = Color.argb(
                /* alpha = */ 255,
                /* red = */ Random.nextInt(256),
                /* green = */ Random.nextInt(256),
                /* blue = */ Random.nextInt(256)
            )
            setBackgroundColor(color)
        }
        view.findViewById<TextView>(R.id.container2).apply {
            val color = Color.argb(
                /* alpha = */ 255,
                /* red = */ Random.nextInt(256),
                /* green = */ Random.nextInt(256),
                /* blue = */ Random.nextInt(256)
            )
            setBackgroundColor(color)
            text = "${Random.nextInt(1000)}"
        }
        view.findViewById<TextView>(R.id.container3).apply {
            val color = Color.argb(
                /* alpha = */ 255,
                /* red = */ Random.nextInt(256),
                /* green = */ Random.nextInt(256),
                /* blue = */ Random.nextInt(256)
            )
            setBackgroundColor(color)
            text = "${Random.nextInt(1000)}"
        }
        view.findViewById<TextView>(R.id.container4).apply {
            val color = Color.argb(
                /* alpha = */ 255,
                /* red = */ Random.nextInt(256),
                /* green = */ Random.nextInt(256),
                /* blue = */ Random.nextInt(256)
            )
            setBackgroundColor(color)
            text = "${Random.nextInt(1000)}"
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}
