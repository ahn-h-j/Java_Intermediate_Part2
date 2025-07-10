package collection.iterable.question;

import java.util.Iterator;

public class Card implements Comparable<Card> {
    private final int num;
    private final Suit  suit;

    public Card(int num, Suit suit) {
        this.num = num;
        this.suit = suit;
    }

    public int getNum() {
        return num;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if (this.num != anotherCard.num) {
            return Integer.compare(this.num, anotherCard.num);
        } else {
            return this.suit.compareTo(anotherCard.suit);
        }
    }
    @Override
    public String toString() {
        return num + "(" + suit.getIcon() + ")";
    }

}
