package ninja.luke.mobi.journey2.advanced.advanced1

import ninja.luke.mobi.journey2.advanced.advanced1.screen.home.HomeRoute
import ninja.luke.mobi.journey2.advanced.app.R
import ninja.luke.mobi.journey2.advanced.input3steps.I3Route
import ninja.luke.mobi.journey2.advanced.input3steps.I3Sdk
import ninja.luke.mobi.journey2.contract.J2ContractNavigator
import ninja.luke.mobi.journey2.scope.J2Navigator

class A1Navigator : J2Navigator(), HomeRoute, I3Route {

    override fun onHomeGoIntro() {
        offerNavEvent(J2ContractNavigator.NextScreen(R.id.action_home_to_intro))
    }

    override fun onHomeGoAdvanced2() {
        offerNavEvent(J2ContractNavigator.NextScreen(R.id.action_home_to_advanced2))
    }

    override fun onHomeGoAdvanced3() {
        offerNavEvent(J2ContractNavigator.NextScreen(
            R.id.action_home_to_input3steps,
            I3Sdk.Params().input1(input1).input2(input2).input3(input3).build()
        ))
    }

    var input1: String = ""
    var input2: String = ""
    var input3: String = ""
    override fun onI3Finished(input1: String, input2: String, input3: String) {
        this.input1 = input1
        this.input2 = input2
        this.input3 = input3
        offerNavEvent(J2ContractNavigator.PopScreen())
    }
}