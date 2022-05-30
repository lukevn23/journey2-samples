package ninja.luke.mobi.journey2.advanced.advanced1.screen.home

import android.os.Bundle
import android.view.View
import android.widget.Toast
import ninja.luke.mobi.journey2.scope.screen.J2ScreenFragment
import ninja.luke.mobi.journey2.advanced.advanced1.A1Sdk
import ninja.luke.mobi.journey2.advanced.app.R

class HomeScreen : J2ScreenFragment<HomeRoute>(
    A1Sdk, R.layout.advanced1_screen_home
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.advanced1).setOnClickListener {
            route?.onHomeGoIntro()
        }
        view.findViewById<View>(R.id.advanced2).setOnClickListener {
            route?.onHomeGoAdvanced2()
        }
        view.findViewById<View>(R.id.advanced3).setOnClickListener {
            //route?.onHomeGoAdvanced2()
            Toast.makeText(requireContext(), "Not implement yet", Toast.LENGTH_SHORT).show()
        }

    }
}