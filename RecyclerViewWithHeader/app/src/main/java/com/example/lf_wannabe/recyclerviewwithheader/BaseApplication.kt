package com.example.lf_wannabe.recyclerviewwithheader

import android.app.Application
import io.realm.Realm

/**
 * Created by lf_wannabe on 28/08/2017.
 */
class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initRealm()

    }

    private fun initRealm(){
        // 초기화 필요없나?
//        Realm.init

    }
}