package ninja.luke.mobi.journey2.advanced.advanced2.screen.home

import android.os.Bundle
import android.view.View
import android.widget.Toast
import ninja.luke.mobi.journey2.advanced.advanced2.A2Sdk
import ninja.luke.mobi.journey2.advanced.app.R
import ninja.luke.mobi.journey2.scope.screen.J2ScreenFragment

class HomeScreen : J2ScreenFragment<HomeRoute>(
    A2Sdk, R.layout.advanced2_screen_home
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.vm1).setOnClickListener {
            route?.onHomeGoVM1()
        }
        view.findViewById<View>(R.id.vm2).setOnClickListener {
            route?.onHomeGoVM2()
        }
        view.findViewById<View>(R.id.vm3).setOnClickListener {
            //route?.onHomeGoVM3()
            Toast.makeText(requireContext(), "Not implement yet", Toast.LENGTH_SHORT).show()
        }
    }
}