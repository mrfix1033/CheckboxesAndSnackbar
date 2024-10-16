package ru.mrfix1033.checkboxesandsnackbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mrfix1033.checkboxesandsnackbar.managers.ButtonClickManager
import ru.mrfix1033.checkboxesandsnackbar.managers.ViewsManager

class MainActivity : AppCompatActivity() {

    lateinit var viewsManager: ViewsManager private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewsManager = ViewsManager(this)
        ButtonClickManager(this)
    }
}