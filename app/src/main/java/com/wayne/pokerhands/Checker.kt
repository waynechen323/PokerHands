package com.wayne.pokerhands

class Checker {
    fun checkStraightFlush(input: String): Boolean {

        val list: List<Card> = input.split(",").map {
            Card(it)
        }


        if (isCheckFlowerSame(list)) {

            //check is 順子

            return isNumberStraightFlush(list)

        } else {

            return false
        }
    }

    private fun isNumberStraightFlush(list: List<Card>): Boolean {

        val numberList = mutableListOf<String>()

        list.forEach {

            numberList.add(it.point!!)
        }


    }

    private fun isCheckFlowerSame(list: List<Card>): Boolean {

        var flowerTemp = list.first().suit

        for (index in 1..list.count()) {

            if (flowerTemp != list[index].suit) {

                return false
            }

            flowerTemp = list[index].suit
        }
        return true
    }
}
