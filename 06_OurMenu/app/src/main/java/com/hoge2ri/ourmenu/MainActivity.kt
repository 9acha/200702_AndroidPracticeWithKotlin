package com.hoge2ri.ourmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.home -> {
                menuImage.setImageResource(R.drawable.okasan)
                menuText.text = ""
                return true
            }
            R.id.greencurry -> {
                menuImage.setImageResource(R.drawable.greencurry)
                menuText.text = getString(R.string.greencurry_text)
                return true
            }
            R.id.beefcurry -> {
                menuImage.setImageResource(R.drawable.beefcurry)
                menuText.text = getString(R.string.beefcurry_text)
                return true
            }
            R.id.soba -> {
                menuImage.setImageResource(R.drawable.soba)
                menuText.text = getString(R.string.soba_text)
                return true
            }
            R.id.ramen -> {
                menuImage.setImageResource(R.drawable.ramen)
                menuText.text = getString(R.string.ramen_text)
                return true
            }
            R.id.oden -> {
                menuImage.setImageResource(R.drawable.oden)
                menuText.text = getString(R.string.oden_text)
                return true
            }
            R.id.osyarenabe -> {
                menuImage.setImageResource(R.drawable.osyarenabe)
                menuText.text = getString(R.string.osyarenabe_text)
                return true
            }
            R.id.beefbowl -> {
                menuImage.setImageResource(R.drawable.beefbowl)
                menuText.text = getString(R.string.beefbowl_text)
                return true
            }
            R.id.peperoncino -> {
                menuImage.setImageResource(R.drawable.peperoncino)
                menuText.text = getString(R.string.peperoncino_text)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}