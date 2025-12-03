package com.ifpr.androidapptemplate.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Sem notificações no momento."
    }
    val text: LiveData<String> = _text
}