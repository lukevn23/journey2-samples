package ninja.luke.mobi.journey2.easy.app

import ninja.luke.mobi.journey2.scope.journey.J2JourneyFragment
import ninja.luke.mobi.journey2.scope.journey.J2JourneyRoute

class EasyJourney : J2JourneyFragment<J2JourneyRoute>(
    EasySdk,
    R.layout.journey_easy
)