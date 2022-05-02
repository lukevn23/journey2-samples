# journey2-samples
This repository will provide the possible use cases of journey2\
\
Will include examples of each component type and the mixing usages\
\
Will include skeleton for: an isolate module, an app with dynamic module\
\
Will include demonstrations for some workaround

# journey2
Journey2 is a framework on top of mvvm that utilize navigation & koin to provide micro frontend, customer journeys, multi modules and parallel development architecture\
\
Key concepts: j2route, j2sdk & j2"micro"\
\
The source code of Journey2 is kept private until the end of May 2023\
\
Important: Journey2 currently support koin 2.1.6 ONLY, support for koin 3.1.6 is on queue

# journey2 versions 2.1
implementation 'ninja.luke.mobile:journey2:2.1.6'\
\
//important: only support koin 2.1.6, using higher koin will lead to crash\
implementation 'io.insert-koin:koin-core:2.1.6'\
\
//other dependencies belong to androidx can be set to latest

# journey2 not support
multi tabs navigation\
drawer navigation\
\
BUT check out our workaround\
\
workaround multi tabs navigation\
workaround drawer navigation
