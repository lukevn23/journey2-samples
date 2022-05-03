package ninja.luke.mobi.journey2.samples.emptyjourney

import ninja.luke.mobi.journey2.scope.J2Sdk
import org.koin.core.module.Module
import org.koin.dsl.module

object EmptySdk : J2Sdk<EmptyRoute>(
    R.id.emptyJourney,
    EmptyJourney::class.java.name,
    EmptyAct::class.java.name
) {

    override fun initDefaultModuleOfViewModels(): Module = module {
        journeyNavigator { EmptyNavigator() }
    }
}