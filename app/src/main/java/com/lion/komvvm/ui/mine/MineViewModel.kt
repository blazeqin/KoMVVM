package com.lion.komvvm.ui.mine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lion.mvvmlib.base.BaseVM

class MineViewModel : BaseVM() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is mine Fragment"
    }
    val text: LiveData<String> = _text
}