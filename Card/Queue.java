public class Queue {
    private final Card[] cardArray;
    private final int capacity;
    private int size;
    private int read;
    private int write;

    public Queue(int capacity) {
        this.cardArray = new Card[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.read = 0;
        this.write = 0;
    }

    public boolean add(Card card) {
        if (isFull()) return false;

        cardArray[write] = card;
        write++;
        size++;
        if (write == capacity) write = 0;

        return true;
    }

    public Card poll() {
        if (isEmpty()) return null;

        Card card = cardArray[read];
        cardArray[read] = null;
        read++;
        size--;
        if (read == capacity) read = 0;

        return card;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) cardArray[i] = null;
        read = 0;
        write = 0;
        size = 0;
    }

    public int getSize() {
        return size;
    }
}
