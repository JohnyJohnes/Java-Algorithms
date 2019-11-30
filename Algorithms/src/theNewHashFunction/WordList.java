package theNewHashFunction;

public class WordList {
    public Word firstWord = null;

    public void insert(Word newWord, int hashKey){
        Word previous = null;
        Word current = firstWord;

        newWord.key = hashKey;

        while (current != null && newWord.key > current.key){

            previous = current;
            current = current.next;
        }
    }
}
