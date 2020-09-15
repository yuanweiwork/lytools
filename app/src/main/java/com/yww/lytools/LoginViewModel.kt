package com.yww.lytools

import androidx.lifecycle.MutableLiveData
import retrofit2.Retrofit

class LoginViewModel {
    val login = MutableLiveData<Boolean>()
    val is1688 = MutableLiveData<Boolean>()

    init {
        login.postValue(false)
        is1688.postValue(true)
    }

    fun login1688() {

//        var retrofit = Retrofit.Builder()
//        retrofit.baseUrl(2)
    }
}