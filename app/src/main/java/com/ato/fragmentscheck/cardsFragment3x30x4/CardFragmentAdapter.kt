package com.ato.fragmentscheck.cardsFragment3x30x4

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ato.fragmentscheck.cardsFragment3x30x4nofragments.CardFragment4NoFragments

class CardFragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 200

    override fun createFragment(position: Int): Fragment {
        val fragment = CardFragment4NoFragments()
        fragment.arguments = Bundle().apply {
            putInt("position", position)
        }
        return fragment
    }
}
