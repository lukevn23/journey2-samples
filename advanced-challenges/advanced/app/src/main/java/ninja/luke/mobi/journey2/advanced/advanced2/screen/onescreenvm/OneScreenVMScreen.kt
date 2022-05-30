package ninja.luke.mobi.journey2.advanced.advanced2.screen.onescreenvm

import ninja.luke.mobi.journey2.advanced.advanced2.A2Sdk
import ninja.luke.mobi.journey2.advanced.advanced2.screen.home.HomeRoute
import ninja.luke.mobi.journey2.advanced.app.R
import ninja.luke.mobi.journey2.advanced.app.databinding.Advanced2ScreenOneScreenBinding
import ninja.luke.mobi.journey2.scope.screen.J2ScreenFragmentBinding
import ninja.luke.mobi.journey2.scope.screen.injectScreenViewModel

class OneScreenVMScreen : J2ScreenFragmentBinding<Advanced2ScreenOneScreenBinding, HomeRoute>(
    A2Sdk, R.layout.advanced2_screen_one_screen
) {

    private val vm: OneScreenViewModel by injectScreenViewModel()

    override fun afterOnViewCreated() {
        super.afterOnViewCreated()
        viewBinding.vm = vm
    }

}