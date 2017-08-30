package com.example.lf_wannabe.recyclerviewwithheader

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.widget.Toast
import com.tutorial.mim.recyclerview_header.adapter.ListAdapterWithHeader
import com.tutorial.mim.recyclerview_header.ex.ExAdapter
import com.tutorial.mim.recyclerview_header.model.Item
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var i: Int = 1

    // by Delegates.notNull() => 멤버변수가 클래스 생성될때 초기화 되지않지만 변수 접근 전에 반드시 초기화되어야 한다!
    private var realm: Realm by Delegates.notNull()
    private var realmConfig: RealmConfiguration by Delegates.notNull()

    var vAdapter: ExAdapter by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        realmConfig = RealmConfiguration.Builder(this).build()
        realm = Realm.getInstance(realmConfig)

        i = realm.where(Item::class.java).findAll().size + 1

        vAdapter = ExAdapter(this, true, Item())
        vAdapter.setOnItemClickListener(object : ListAdapterWithHeader.OnItemClickListener {
            override fun onItemClick(v: View, position: Int) {
                Toast.makeText(applicationContext, position.toString() + "TOUCHED", Toast.LENGTH_SHORT).show()
            }
        })

        with(list){
            setHasFixedSize(false)
            adapter = vAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        addBtn.setOnClickListener{
//            startActivity(Intent(this, PopupActivity::class.java))

            realm.beginTransaction()
            var tmp = realm.createObject(Item::class.java)
            tmp.num     = i++
            tmp.title   = "TITLE"
            tmp.content = "CONTENT"
            realm.commitTransaction()

            vAdapter.setData(realm.where(Item::class.java).findAll())
        }

    }
    override fun onResume() {
        super.onResume()
        vAdapter.setData(realm.where(Item::class.java).findAll())
    }
}
