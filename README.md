# journey2-samples
This repository will provide the possible use cases of journey2\
\
Will include examples of each component type (journey, screen & single) and the mixing usages\
\
Will include skeleton for: an isolated module, an app with dynamic feature\
\
Will include demonstrations for some workarounds 

# Journey2
## Content layout
Introduction\
Easy to start\
Advanced challenges\
Parallel development\
Technical keywords\
Others

## Introduction
Journey2 is a framework that utilize mvvm, navigation & koin to provide micro frontend, customer journeys, multi modules and parallel development architecture\
\
Key concepts: j2route, j2sdk & j2"micro"\
\
The full source code of Journey2 is planned to keep in private repository until the end of May 2025 to avoid unwanted legal problems for the owner\
You can get to use the library just by pulling it from mavenCentral. Also please use it at your own risk\
While it's in private repository, it will be maintained by me (and some contributors). Feel free to ping me if there's any issues in the framework itself\
\
Ping me if you want to access the private repository\
\
Important: Journey2 currently support koin 2.1.6 ONLY\
\
The support for koin 3.1.6 is on the queue\
The support for hilt is on the queue\
The support for full clean architecture application is on the queue


## Easy to start
Keep the way you create a fragment
```
class Single1 : J2SingleFragment<J2SingleRoute>() {
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.app_screen_single1, container, false)
    }
}
```
\
Simplify the way you navigate
```
interface Single2Route : J2SingleRoute {
    fun onSingle2ButtonClick()
}
//...
v.findViewById<View>(R.id.click).setOnClickListener {
    route?.onSingle2ButtonClick()
}
```

## Advanced challenges
for senior, with J2Journey / J2Screen\
\
practice 1 - journey setup\
\
practice 2 - journey viewmodel vs screen viewmodel\
\
practice 3 - reuse-able journey\
\
practice 4 - mixing between screens & children journeys\
\
practice 5 - widgets & shared stuffs 

## Parallel development
isolated journeys on different repositories, with self-testing solution, and a try on dynamic features\
\
practice 1 - isolated journey setup\
\
practice 2 - start your own journey only\
\
practice 3 - dynamic feature setup 

## Technical keywords
Android, Java, Kotlin, MVVM, Navigation, Dependency injection, Koin, Live data, Coroutines, Parallel development, Isolated module, Multiple modules, Multiple repositories, Micro frontend, Customer journeys, Dynamic feature, 

## Others
### Journey2 versions 2.1
implementation 'ninja.luke.mobi:journey2:2.1.6'\
\
//important: only support koin 2.1.6, using higher koin will lead to crash\
implementation 'io.insert-koin:koin-core:2.1.6'\
\
//other dependencies belong to androidx can be set to latest

### Journey2 does not support directly
Multi tabs navigation\
Drawer navigation\
\
BUT check out our workaround\
\
Workaround multi tabs navigation\
Workaround drawer navigation

### Donation
If this project help you reduce time to develop, you can give me a cup of coffee :) \
\
[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/paypalme/lukeninja)
