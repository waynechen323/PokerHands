package com.wayne.pokerhands

import java.lang.Exception

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
    val numberPoint: Int?
        get() {
            var int: Int? = 0
            int = try {
                point?.toInt()
            } catch(e: Exception) {
                when (point) {
                    "A" -> 1
                    "J" -> 11
                    "Q" -> 12
                    "K" -> 13
                    else -> -1
                }
            }
            return int
        }
}