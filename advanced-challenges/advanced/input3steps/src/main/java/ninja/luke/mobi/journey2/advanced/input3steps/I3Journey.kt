package ninja.luke.mobi.journey2.advanced.input3steps

import android.os.Bundle
import android.view.View
import ninja.luke.mobi.journey2.contract.J2ContractNavigator
import ninja.luke.mobi.journey2.scope.journey.J2JourneyFragment
import ninja.luke.mobi.journey2.scope.journey.injectJourneyViewModel

class I3Journey : J2JourneyFragment<I3Route>(
    I3Sdk, R.layout.journey_input3steps
) {

    private val vm: I3ViewModel by injectJourneyViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        microArguments?.let { b ->
            val p = I3Sdk.Params(b)
            vm.input1.postValue(p.input1())
            vm.input2.postValue(p.input2())
            vm.input3.postValue(p.input3())
        }
    }

    override fun onNavEventReceived(event: J2ContractNavigator.J2NavEvent) {
        when (event) {
            is I3Navigator.FinishInput -> {
                route?.onI3Finished(
                    vm.input1.value ?: "",
                    vm.input2.value ?: "",
                    vm.input3.value ?: ""
                )
            }
            else -> super.onNavEventReceived(event)
        }
    }

}