package ninja.luke.mobi.journey2.advanced.advanced1

import ninja.luke.mobi.journey2.advanced.advanced1.screen.home.HomeRoute
import ninja.luke.mobi.journey2.advanced.app.R
import ninja.luke.mobi.journey2.contract.J2ContractNavigator
import ninja.luke.mobi.journey2.scope.J2Navigator

class A1Navigator : J2Navigator(), HomeRoute {

    override fun onHomeGoIntro() {
        offerNavEvent(J2ContractNavigator.NextScreen(R.id.action_home_to_intro))
    }

    override fun onHomeGoAdvanced2() {
        offerNavEvent(J2ContractNavigator.NextScreen(R.id.action_home_to_advanced2))
    }

    override fun onHomeGoAdvanced3() {
        TODO("Not yet implemented")
    }
}