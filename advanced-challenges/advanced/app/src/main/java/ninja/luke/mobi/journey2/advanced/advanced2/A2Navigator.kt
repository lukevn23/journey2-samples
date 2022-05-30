package ninja.luke.mobi.journey2.advanced.advanced2

import ninja.luke.mobi.journey2.advanced.advanced2.screen.home.HomeRoute
import ninja.luke.mobi.journey2.advanced.app.R
import ninja.luke.mobi.journey2.contract.J2ContractNavigator
import ninja.luke.mobi.journey2.scope.J2Navigator

class A2Navigator : J2Navigator(), HomeRoute {

    override fun onHomeGoVM1() {
        offerNavEvent(J2ContractNavigator.NextScreen(R.id.action_home_to_onescreen))
    }

    override fun onHomeGoVM2() {
        offerNavEvent(J2ContractNavigator.NextScreen(R.id.action_home_to_multiscreen))
    }

    override fun onHomeGoVM3() {
        TODO("Not yet implemented")
    }
}