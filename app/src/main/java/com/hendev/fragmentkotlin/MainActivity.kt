package com.hendev.fragmentkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ilkFragment(view: View) {
        val fragmentManger = supportFragmentManager
        val fragmentTransaction = fragmentManger.beginTransaction()

        val firstFragment = BlankFragment()
        fragmentTransaction.replace(R.id.MainFramLayout, firstFragment).commit()
    }

    fun ikinciFragment(view: View){
        val fragmentManger = supportFragmentManager
        val fragmentTransaction = fragmentManger.beginTransaction()

        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.MainFramLayout, secondFragment).commit()
        //add ile kullanılacagı zaman var olan fragmanın üzerine eklenir. ornegin ekranda soruların öğrenci tarafından işaretlenmiş şıkları olur ve cevapları goster dedigimizde ilgili alanları boyanmıs olarak fragmentı ilkinin üzerine eklyerek goseterebiliriz.
    }

}