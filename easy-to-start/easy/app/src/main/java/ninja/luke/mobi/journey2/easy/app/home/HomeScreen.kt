package ninja.luke.mobi.journey2.easy.app.home

import android.os.Bundle
import android.view.View
import ninja.luke.mobi.journey2.easy.app.EasySdk
import ninja.luke.mobi.journey2.easy.app.R
import ninja.luke.mobi.journey2.scope.screen.J2ScreenFragment

class HomeScreen : J2ScreenFragment<HomeRoute>(
    EasySdk,
    R.layout.fragment_home
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.single1).setOnClickListener {
            route?.onEasyGoSingle1()
        }
        view.findViewById<View>(R.id.single2).setOnClickListener {
            route?.onEasyGoSingle2()
        }
        view.findViewById<View>(R.id.single3).setOnClickListener {
            route?.onEasyGoSingle3()
        }
    }
}