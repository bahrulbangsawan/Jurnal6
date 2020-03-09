package org.d3if4118.jurnal6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel(){

    private var _scoreTeamA = MutableLiveData<Int>()
        val scoreTeamA : LiveData<Int>
        get() = _scoreTeamA

    private var _scoreTeamB = MutableLiveData<Int>()
        val scoreTeamB : LiveData<Int>
        get() = _scoreTeamB

    init {

    }

    override fun onCleared() {
        super.onCleared()
    }
//
}
