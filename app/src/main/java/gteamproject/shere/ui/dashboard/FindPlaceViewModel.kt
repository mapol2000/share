package gteamproject.shere.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FindPlaceViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is find place Fragment"
    }
    val text: LiveData<String> = _text
}