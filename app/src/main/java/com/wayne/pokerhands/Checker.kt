package com.wayne.pokerhands

class Checker {
    fun checkIsPair(input: String): Boolean {
        val list = fetchCards(input);
        checkIfAllDifferent(list)

        return false
    }

    fun checkIfAllDifferent(cards: List<Card>) : Boolean {

        var temp: List<String>
//        var
//
//        for (card in cards) {
//
//            if (card.suit)
//
//        }
        return false
    }

    private fun fetchCards (input: String): List<Card> {
        return input.split(",").map {
            Card(it)
        }
    }

    fun checkStraightFlush(input: String): Boolean {

        val list = fetchCards(input);


        if (isCheckFlowerSame(list)) {

            //check is 順子

            return isNumberStraightFlush(list)

        } else {

            return false
        }
    }

    private fun isNumberStraightFlush(list: List<Card>): Boolean {

        val numberList = mutableListOf<Int>()

        list.forEach {

            numberList.add(it.numberPoint!!)
        }

        val sort = numberList.sorted()

        return sort.last() - sort.first() == 4

    }

    private fun isCheckFlowerSame(list: List<Card>): Boolean {

        var flowerTemp = list.first().suit

        for (index in 1 until list.count()) {

            if (flowerTemp != list[index].suit) {

                return false
            }

            flowerTemp = list[index].suit
        }
        return true
    }
}
