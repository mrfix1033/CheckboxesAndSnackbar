package ru.mrfix1033.checkboxesandsnackbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mrfix1033.checkboxesandsnackbar.managers.ButtonClicks
import ru.mrfix1033.checkboxesandsnackbar.managers.Views

class MainActivity : AppCompatActivity() {

    lateinit var views: Views private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        views = Views(this)
        ButtonClicks(this)
    }
}