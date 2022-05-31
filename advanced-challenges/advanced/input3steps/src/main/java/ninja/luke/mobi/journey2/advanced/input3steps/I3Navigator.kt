package ninja.luke.mobi.journey2.advanced.input3steps

import android.os.Bundle
import ninja.luke.mobi.journey2.advanced.input3steps.screen.input1.Input1Route
import ninja.luke.mobi.journey2.advanced.input3steps.screen.input2.Input2Route
import ninja.luke.mobi.journey2.advanced.input3steps.screen.input3.Input3Route
import ninja.luke.mobi.journey2.contract.J2ContractNavigator
import ninja.luke.mobi.journey2.scope.J2Navigator

class I3Navigator : J2Navigator(), Input1Route, Input2Route, Input3Route {

    override fun onInput1Finish(input1: String) {
        offerNavEvent(J2ContractNavigator.NextScreen(R.id.action_input1_to_input2))
    }

    override fun onInput2Finish(input2: String) {
        offerNavEvent(J2ContractNavigator.NextScreen(R.id.action_input2_to_input3))
    }

    override fun onInput3Finish(input3: String) {
        offerNavEvent(FinishInput())
    }

    data class FinishInput(override val action: Int = 0, override val extras: Bundle? = null) :
        J2ContractNavigator.J2NavEvent()

}