package com.practice.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.practice.noteapp.ui.theme.BabyBlue
import com.practice.noteapp.ui.theme.LightGreen
import com.practice.noteapp.ui.theme.RedOrange
import com.practice.noteapp.ui.theme.RedPink
import com.practice.noteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
