package com.example.lf_wannabe.recyclerviewwithheader

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlin.properties.Delegates

/**
 * Created by lf_wannabe on 28/08/2017.
 */
class BaseApplication: Application() {

//    companion object {
//        var realm: Realm by Delegates.notNull()
//        var realmConfig: RealmConfiguration by Delegates.notNull()
//    }
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

//        realmConfig = RealmConfiguration.Builder(this).build()
//        realm = Realm.getInstance(realmConfig)

    }

}