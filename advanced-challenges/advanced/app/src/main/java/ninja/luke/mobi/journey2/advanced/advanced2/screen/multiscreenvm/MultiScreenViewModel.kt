package ninja.luke.mobi.journey2.advanced.advanced2.screen.multiscreenvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MultiScreenViewModel : ViewModel() {

    init {
        Log.e("Lu", "VM Multi $this")
    }

    private var count = 0
    val counterLive: MutableLiveData<String> = MutableLiveData(count.toString())

    fun increaseCounter() {
        count++
        counterLive.postValue(count.toString())
    }

}