package com.hoge2ri.ourmenu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        ↓menuImageに対してコンテキストメニューが表示されるように登録する
        registerForContextMenu(menuImage)
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

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if (menuText.text.isNotEmpty()) {
            menuInflater.inflate(R.menu.context, menu)
        }
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.mail -> {
                val subject = getString(R.string.app_name)
                val text = "${menuText.text}がたべたい！"
                val uri = Uri.fromParts("mailto", "gacha.applepie@gmail.com", null)
                val intent = Intent(Intent.ACTION_SENDTO, uri)
                intent.putExtra(Intent.EXTRA_SUBJECT, subject)
                intent.putExtra(Intent.EXTRA_TEXT, text)
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
                return true
            }

            R.id.sms -> {
                val text = "${menuText.text}がたべたい！"
                val uri = Uri.fromParts("smsto", "09084188472", null)
                val intent = Intent(Intent.ACTION_SENDTO, uri)
                intent.putExtra("sms_body", text)
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
                return true
            }
        }
        return super.onContextItemSelected(item)
    }

}