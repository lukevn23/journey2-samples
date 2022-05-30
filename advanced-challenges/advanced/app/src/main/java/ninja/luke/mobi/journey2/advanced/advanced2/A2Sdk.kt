package ninja.luke.mobi.journey2.advanced.advanced2

import ninja.luke.mobi.journey2.advanced.advanced2.screen.multiscreenvm.MultiScreenViewModel
import ninja.luke.mobi.journey2.advanced.advanced2.screen.onescreenvm.OneScreenViewModel
import ninja.luke.mobi.journey2.advanced.app.R
import ninja.luke.mobi.journey2.scope.J2Sdk
import org.koin.core.module.Module
import org.koin.dsl.module

object A2Sdk : J2Sdk<A2Route>(
    R.id.a2Journey,
    A2Journey::class.java.name
) {

    override fun initDefaultModuleOfViewModels(): Module = module {
        journeyNavigator { A2Navigator() }
        screenViewModel { OneScreenViewModel() }
        journeyViewModel { MultiScreenViewModel() }
    }
}