package com.wayne.pokerhands

/**
 * Created by Wayne Chen on 2020/7/16.
 */
data class Card(
    val input: String
) {
    var suit: Suits? = when (input[0]) {
        'C' -> Suits.Clubs
        'D' -> Suits.Diamonds
        'H' -> Suits.Hearts
        'S' -> Suits.Spades
        else -> null
    }
    val point: String? = when (input[1]) {
        'A' -> "A"
        'J' -> "J"
        'Q' -> "Q"
        'K' -> "K"
        else -> input[1].toString()
    }
}