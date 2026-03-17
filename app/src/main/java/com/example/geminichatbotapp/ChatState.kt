package com.example.geminichatbotapp

import android.graphics.Bitmap
import com.example.geminichatbotapp.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)