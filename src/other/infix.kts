enum class Ordinal {
    ONE, TWO, THREE, FOUR, FIVE,
    SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, KING, QUEEN, ACE
}

enum class Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES
}

data class Card(val ordinal: Ordinal, val suit: Suit)

infix fun Ordinal.of(suit: Suit) = Card(this, suit)

Ordinal.ONE of Suit.HEARTS