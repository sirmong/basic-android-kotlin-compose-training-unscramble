package com.example.unscramble.ui

data class GameUIState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false
)
