package com.example.lf_wannabe.recyclerviewwithheader

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.tutorial.mim.recyclerview_header.ex.ExAdapter
import com.tutorial.mim.recyclerview_header.model.Item
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var i: Int = 1

    private var realm: Realm by Delegates.notNull()
    private var realmConfig: RealmConfiguration by Delegates.notNull()

    var vAdapter: ExAdapter by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        realmConfig = RealmConfiguration.Builder(this).build()
        realm = Realm.getInstance(realmConfig)

        vAdapter = ExAdapter(this, true, Item())

        with(list){
            setHasFixedSize(false)
            adapter = vAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        addBtn.setOnClickListener{
            realm.beginTransaction()
            var tmp = realm.createObject(Item::class.java)
            tmp.num     = i++
            tmp.title   = "TITLE"
            tmp.content = "CONTENT"
            realm.commitTransaction()

//            vAdapter.setData(realm.where(Item::class.java).findAll())
        }

    }

    override fun onResume() {
        super.onResume()
        vAdapter.setData(realm.where(Item::class.java).findAll())
    }
}
