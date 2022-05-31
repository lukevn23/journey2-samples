package ninja.luke.mobi.journey2.advanced.input3steps

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class I3ViewModel : ViewModel() {

    val input1: MutableLiveData<String> = MutableLiveData(null)
    val input2: MutableLiveData<String> = MutableLiveData(null)
    val input3: MutableLiveData<String> = MutableLiveData(null)

}