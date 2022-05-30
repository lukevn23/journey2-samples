package ninja.luke.mobi.journey2.advanced.advanced2.screen.onescreenvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OneScreenViewModel : ViewModel() {

    init {
        Log.e("Lu", "VM One $this")
    }

    private var count = 0
    val counterLive: MutableLiveData<String> = MutableLiveData(count.toString())

    fun increaseCounter() {
        count++
        counterLive.postValue(count.toString())
    }

}