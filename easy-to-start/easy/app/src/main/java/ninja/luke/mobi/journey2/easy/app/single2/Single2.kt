package ninja.luke.mobi.journey2.easy.app.single2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ninja.luke.mobi.journey2.easy.app.R
import ninja.luke.mobi.journey2.scope.single.J2SingleFragment
import ninja.luke.mobi.journey2.scope.single.J2SingleRoute

interface Single2Route : J2SingleRoute {
    fun onSingle2ButtonClick()
}

class Single2 : J2SingleFragment<Single2Route>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_single2, container, false)
        v.findViewById<View>(R.id.click).setOnClickListener {
            if (it.isEnabled) {
                it.isEnabled = false
                route?.onSingle2ButtonClick()
            }
        }
        return v
    }

}