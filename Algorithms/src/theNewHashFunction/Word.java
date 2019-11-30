package theNewHashFunction;

public class Word {

    public String theWord;
    public String definition;

    public int key;

    public Word next;

    public Word(String theWord, String definition) {

        this.theWord = theWord;
        this.definition = definition;

    }

    @Override
    public String toString() {
        return "Word{" +
                "theWord='" + theWord + '\'' +
                ", definition='" + definition + '\'' +
                ", key=" + key +
                ", next=" + next +
                '}';
    }
}
