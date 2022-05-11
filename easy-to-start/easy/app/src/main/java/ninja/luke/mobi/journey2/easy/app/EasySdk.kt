package ninja.luke.mobi.journey2.easy.app

import ninja.luke.mobi.journey2.scope.J2Sdk
import ninja.luke.mobi.journey2.scope.journey.J2JourneyRoute
import org.koin.core.module.Module
import org.koin.dsl.module

object EasySdk : J2Sdk<J2JourneyRoute>(
    R.id.easyJourney,
    EasyJourney::class.java.name,
    EasyActivity::class.java.name
) {
    override fun initDefaultModuleOfViewModels(): Module = module {
        journeyNavigator { EasyNavigator() }
    }
}