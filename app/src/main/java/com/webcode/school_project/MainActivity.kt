package com.webcode.school_project

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Future School Map"
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.menu_fragment, FragmentMenu.newInstance())
            .commit()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_fragment, BlankFragment.newInstance())
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.firstfloor -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_fragment, BlankFragment.newInstance())
                    .commit()
            }
            R.id.secondfloor -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_fragment, BlankFragment2.newInstance())
                    .commit()
            }
            R.id.thirdfloor -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_fragment, BlankFragment3.newInstance())
                    .commit()
            }
        }
        return true
    }


}