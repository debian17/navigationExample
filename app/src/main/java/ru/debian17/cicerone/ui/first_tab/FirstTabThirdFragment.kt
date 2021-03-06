package ru.debian17.cicerone.ui.first_tab


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first_tab_third.*

import ru.debian17.cicerone.R
import ru.debian17.cicerone.navigation.BackButtonListener
import ru.debian17.cicerone.navigation.RouterProvider
import ru.debian17.cicerone.navigation.screen.ActivityScreen
import ru.debian17.cicerone.ui.TestActivity

class FirstTabThirdFragment : androidx.fragment.app.Fragment(), BackButtonListener {

    companion object {
        fun newInstance(): FirstTabThirdFragment {
            return FirstTabThirdFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first_tab_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnStartActivity.setOnClickListener {
            val screen = ActivityScreen(TestActivity.getStartIntent(requireContext()))
            (parentFragment as RouterProvider).router.navigateTo(screen)
        }
    }

    override fun onBackPressed(): Boolean {
        (parentFragment as RouterProvider).router.exit()
        return true
    }

}
