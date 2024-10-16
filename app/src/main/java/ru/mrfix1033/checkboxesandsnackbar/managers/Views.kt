package ru.mrfix1033.checkboxesandsnackbar.managers

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.mrfix1033.checkboxesandsnackbar.R

class Views(app: AppCompatActivity) {

    val etEnterText: EditText
    val tvLabel: TextView
    val btnSaveData: Button
    val btnDeleteData: Button

    init {
        app.run {
            etEnterText = findViewById(R.id.etEnterText)
            tvLabel = findViewById(R.id.tvLabel)
            btnSaveData = findViewById(R.id.btnSaveData)
            btnDeleteData = findViewById(R.id.btnDeleteData)
        }
    }
}