public class Card {
    public enum Rank {
        ACE('A'), KING('K'), QUEEN('Q'), JACK('J'), TEN('T'), 
        NINE('9'), EIGHT('8'), SEVEN('7'), SIX('6'), FIVE('5'), 
        FOUR('4'), THREE('3'), TWO('2');

        private final char value;

        Rank(char value) {
            this.value = value;
        }

        public char getRank() {
            return value;         
        }
    }

    public enum Suit {
        SPADES('s'), HEARTS('h'), DIAMONDS('d'), CLUBS('c');

        private final char symbol;

        Suit(char symbol) {
            this.symbol = symbol;
        }

        public char getSuit() {
            return symbol;
        }
    }

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank.name() + " of " + suit.name();
    }

    public boolean compareRank(Card o) {
        return rank == o.rank;
    }

    public boolean compareSuit(Card o) {
        return suit == o.suit;
    }
}
