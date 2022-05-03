package ninja.luke.mobi.journey2.samples.emptyjourney

import androidx.multidex.MultiDexApplication
import ninja.luke.mobi.journey2.contract.J2Configs

class EmptyApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        J2Configs.ENABLE_WINDOWS_SECURE_ALL_APP_DEFAULT = true
    }

}