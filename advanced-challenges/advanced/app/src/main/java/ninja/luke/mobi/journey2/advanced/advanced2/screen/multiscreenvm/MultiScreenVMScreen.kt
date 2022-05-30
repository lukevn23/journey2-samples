package ninja.luke.mobi.journey2.advanced.advanced2.screen.multiscreenvm

import ninja.luke.mobi.journey2.advanced.advanced2.A2Sdk
import ninja.luke.mobi.journey2.advanced.advanced2.screen.home.HomeRoute
import ninja.luke.mobi.journey2.advanced.app.R
import ninja.luke.mobi.journey2.advanced.app.databinding.Advanced2ScreenMultiScreenBinding
import ninja.luke.mobi.journey2.scope.screen.J2ScreenFragmentBinding
import ninja.luke.mobi.journey2.scope.screen.injectJourneyViewModel

class MultiScreenVMScreen : J2ScreenFragmentBinding<Advanced2ScreenMultiScreenBinding, HomeRoute>(
    A2Sdk, R.layout.advanced2_screen_multi_screen
) {

    private val vm: MultiScreenViewModel by injectJourneyViewModel()

    override fun afterOnViewCreated() {
        super.afterOnViewCreated()
        viewBinding.vm = vm
    }

}