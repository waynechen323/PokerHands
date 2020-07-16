package com.wayne.pokerhands

import org.junit.Assert
import org.junit.Test

/**
 * Created by Wayne Chen on 2020/7/15.
 */
class DojoTest {


    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2)
    }

    @Test
    fun 如果是牌的話喔() {

        val card = Card("C3")

        Assert.assertNotNull(card.suit)
        Assert.assertNotNull(card.point)
    }

    @Test
    fun 如果是方塊的話喔() {

        val card = Card("C3")

        Assert.assertEquals(card.suit, Suits.Clubs)
    }

    @Test
    fun 如果是方塊三的話喔() {

        val card = Card("C3")

        Assert.assertEquals(card.suit, Suits.Clubs)
        Assert.assertEquals(card.point, "3")
    }

    @Test
    fun 輸入一串字牌拿到五張牌() {
        val input = "C1,C2,C3,C4,C5"
        val fiveCards = FiveCards(input)
        Assert.assertEquals(5 , fiveCards.list)
    }

    @Test
    fun 各位觀眾同花順() {
        val input = "CA,C2,C3,C4,C5"

        val isStraightFlush = Checker().checkStraightFlush(input)

        Assert.assertTrue(isStraightFlush)
    }

}