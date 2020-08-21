package ru.debian17.cicerone.ui.patient


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_patients.*

import ru.debian17.cicerone.R
import ru.debian17.cicerone.navigation.RouterProvider
import ru.debian17.cicerone.navigation.screen.FragmentScreen

class PatientsFragment : androidx.fragment.app.Fragment() {

    companion object {
        fun newInstance(): PatientsFragment {
            return PatientsFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_patients, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnPatientInfo.setOnClickListener {
            (parentFragment as RouterProvider).router.navigateTo(FragmentScreen(PatientInfoFragment.newInstance()))
        }
    }

}
