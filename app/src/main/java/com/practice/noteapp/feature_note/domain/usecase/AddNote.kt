package com.practice.noteapp.feature_note.domain.usecase

import com.practice.noteapp.feature_note.domain.model.InvalidNoteException
import com.practice.noteapp.feature_note.domain.model.Note
import com.practice.noteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Note title can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Note content can't be empty")
        }
        repository.insertNote(note)
    }
}