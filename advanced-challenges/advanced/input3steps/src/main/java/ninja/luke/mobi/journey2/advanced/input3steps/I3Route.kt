package ninja.luke.mobi.journey2.advanced.input3steps

import ninja.luke.mobi.journey2.scope.journey.J2JourneyRoute

interface I3Route : J2JourneyRoute {
    fun onI3Finished(input1: String, input2: String, input3: String)
}