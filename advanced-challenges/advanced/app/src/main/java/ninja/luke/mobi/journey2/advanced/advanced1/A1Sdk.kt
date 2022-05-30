package ninja.luke.mobi.journey2.advanced.advanced1

import ninja.luke.mobi.journey2.advanced.app.AdvancedAct
import ninja.luke.mobi.journey2.advanced.app.R
import ninja.luke.mobi.journey2.scope.J2Sdk
import org.koin.core.module.Module
import org.koin.dsl.module

object A1Sdk : J2Sdk<A1Route>(
    R.id.a1Journey,
    A1Journey::class.java.name,
    AdvancedAct::class.java.name
) {

    override fun initDefaultModuleOfViewModels(): Module = module {
        journeyNavigator { A1Navigator() }
    }
}