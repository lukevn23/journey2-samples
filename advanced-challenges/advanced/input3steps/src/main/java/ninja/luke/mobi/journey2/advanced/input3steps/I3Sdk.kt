package ninja.luke.mobi.journey2.advanced.input3steps

import android.os.Bundle
import ninja.luke.mobi.journey2.scope.J2Sdk
import org.koin.core.module.Module
import org.koin.dsl.module

object I3Sdk : J2Sdk<I3Route>(
    R.id.i3Journey,
    I3Journey::class.java.name
) {

    override fun initDefaultModuleOfViewModels(): Module = module {
        journeyNavigator { I3Navigator() }
        journeyViewModel { I3ViewModel() }
    }

    class Params(private val bundle: Bundle = Bundle()) {

        fun input1(input1: String?): Params {
            bundle.putString("input1", input1)
            return this
        }

        fun input2(input2: String?): Params {
            bundle.putString("input2", input2)
            return this
        }

        fun input3(input3: String?): Params {
            bundle.putString("input3", input3)
            return this
        }

        fun input1(): String? = bundle.getString("input1")
        fun input2(): String? = bundle.getString("input2")
        fun input3(): String? = bundle.getString("input3")

        fun build(): Bundle = bundle
    }
}