package ru.debian17.cicerone.ui.medorg


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_med_orgs.*

import ru.debian17.cicerone.R
import ru.debian17.cicerone.navigation.BackButtonListener
import ru.debian17.cicerone.navigation.RouterProvider
import ru.debian17.cicerone.navigation.screen.FragmentScreen

class MedOrgsFragment : androidx.fragment.app.Fragment(), BackButtonListener {

    companion object {
        fun newInstance(): MedOrgsFragment {
            return MedOrgsFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_med_orgs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnMedOrgInfo.setOnClickListener {
            (parentFragment as RouterProvider).router.navigateTo(FragmentScreen(MedOrgInfoFragment.newInstance()))
        }
    }

    override fun onBackPressed(): Boolean {
        (parentFragment as RouterProvider).router.exit()
        return true
    }

}
