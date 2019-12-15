package com.kotlinhva.notepad51.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.kotlinhva.notepad51.database.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()

}