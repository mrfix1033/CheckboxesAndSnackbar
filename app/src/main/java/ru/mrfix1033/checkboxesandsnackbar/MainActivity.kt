package ru.mrfix1033.checkboxesandsnackbar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var etEnterText: EditText
    lateinit var tvLabel: TextView
    lateinit var btnSaveData: Button
    lateinit var btnDeleteData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEnterText = findViewById(R.id.etEnterText)
        tvLabel = findViewById(R.id.tvLabel)
        btnSaveData = findViewById(R.id.btnSaveData)
        btnDeleteData = findViewById(R.id.btnDeleteData)

        findViewById<Button>(R.id.btnSaveData).setOnClickListener {
            tvLabel.text = etEnterText.text
        }

        findViewById<Button>(R.id.btnDeleteData).setOnClickListener {
            Snackbar.make(it, R.string.delete_confirmation, Snackbar.LENGTH_LONG)
                .setAction(R.string.confirmation_label) { itSnackBar ->
                    tvLabel.text = ""
                    Snackbar.make(
                        itSnackBar,
                        R.string.you_confirmed_delete,
                        Snackbar.LENGTH_SHORT
                    ).show()
                }.show()
        }
    }
}