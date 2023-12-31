package com.lazydeveloper.cleanpad.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lazydeveloper.cleanpad.ui.theme.BabyBlue
import com.lazydeveloper.cleanpad.ui.theme.LightGreen
import com.lazydeveloper.cleanpad.ui.theme.RedOrange
import com.lazydeveloper.cleanpad.ui.theme.RedPink
import com.lazydeveloper.cleanpad.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }
}
