package com.wayne.pokerhands

data class FiveCards(private val input: String) {
    val list: List<Card> = input.split(",").map {
        Card(it)
    }

}
