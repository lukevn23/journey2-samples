package ninja.luke.mobi.journey2.easy.app.single1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ninja.luke.mobi.journey2.easy.app.R
import ninja.luke.mobi.journey2.scope.single.J2SingleFragment
import ninja.luke.mobi.journey2.scope.single.J2SingleRoute

class Single1 : J2SingleFragment<J2SingleRoute>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_single1, container, false)
    }
}