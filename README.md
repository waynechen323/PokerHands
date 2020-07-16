# PokerHands Coding Dojo
Respect from [Coding Dojo of Android Taipei](https://github.com/bng86/PokerHandsCodingDojo-20190529)

## PokerHands 遊戲需求

- 撲克牌點數：2 to 9、A、J、Q、K
- 撲克牌花色：梅花(Clubs)、方塊(Diamonds)、紅心(Hearts)、黑桃(Spades)
  - 梅花 A -> CA
  - 方塊 K -> DK
  - 紅心 4 -> H4
  - 黑桃 7 -> S7
- 牌組
  - 同花順 (StraightFlush)
  - 鐵支 (FourOfAKind)
  - 葫蘆 (FullHouse)
  - 同花 (Flush)
  - 順子 (Straight)
  - 三條 (ThreeOfAKind)
  - 兩對 (TwoPair)
  - 一對 (OnePair)
  - 沒有組合 (HighCard)
  
- Input 五張牌的字串 e.g. CA, C2, C3, C4, C5 回傳牌組名稱

- Test Case
  - CA, C2, C3, C4, C5 -> StraightFlush
  - CA, DA, HA, SA, C2 -> FourOfAKind
  - CA, DA, HA, C2, C2 -> FullHouse
  - CA, C3, C5, C7, C9 -> Flush
  - CA, D2, C3, C4, C5 -> Straight
  - CA, DA, HA, C2, C3 -> ThreeOfAKind
  - CA, DA, H3, C2, H2 -> TwoPair
  - CA, DA, H3, C4, H5 -> OnePair
  - CA, D3, C5, C7, C9 -> HighCard
