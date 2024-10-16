package ru.mrfix1033.checkboxesandsnackbar.managers

import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import ru.mrfix1033.checkboxesandsnackbar.MainActivity
import ru.mrfix1033.checkboxesandsnackbar.R

class ButtonClickManager(app: MainActivity) {

    init {
        app.run {
            findViewById<Button>(R.id.btnSaveData).setOnClickListener {
                viewsManager.tvLabel.text = viewsManager.etEnterText.text
            }

            findViewById<Button>(R.id.btnDeleteData).setOnClickListener {
                Snackbar.make(it, R.string.delete_confirmation, Snackbar.LENGTH_LONG)
                    .setAction(R.string.confirmation_label) { itSnackBar ->
                        viewsManager.tvLabel.clearComposingText()
                        Snackbar.make(
                            itSnackBar,
                            R.string.you_confirmed_delete,
                            Snackbar.LENGTH_SHORT
                        ).show()
                    }.show()
            }
        }
    }
}