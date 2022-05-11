package ninja.luke.mobi.journey2.easy.app

import ninja.luke.mobi.journey2.contract.J2ContractNavigator.*
import ninja.luke.mobi.journey2.easy.app.home.HomeRoute
import ninja.luke.mobi.journey2.easy.app.single2.Single2Route
import ninja.luke.mobi.journey2.easy.app.single3.Single3Route
import ninja.luke.mobi.journey2.scope.J2Navigator

class EasyNavigator : J2Navigator(), HomeRoute, Single2Route, Single3Route {

    override fun onEasyGoSingle1() {
        offerNavEvent(NextScreen(R.id.action_home_to_single1))
    }

    override fun onEasyGoSingle2() {
        offerNavEvent(NextScreen(R.id.action_home_to_single2))
    }

    override fun onEasyGoSingle3() {
        offerNavEvent(NextScreen(R.id.action_home_to_single3))
    }

    override fun onSingle2ButtonClick() {
        offerNavEvent(PopScreen())
    }

    override fun onSingle3GoNextOnLiveData() {
        offerNavEvent(PopScreen())
    }
}