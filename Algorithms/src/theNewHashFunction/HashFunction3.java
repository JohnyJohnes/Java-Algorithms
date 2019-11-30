package theNewHashFunction;

public class HashFunction3 {

    WordList[] theArray;

    public int arraySize;

    public int stringHashFunction(String wordToHash){

        int hashKeyValue = 0;

        for (int i = 0; i < wordToHash.length(); i++) {

            int charCode = wordToHash.charAt(i)-96;

            int hKVTemp = hashKeyValue;

            hashKeyValue = (hashKeyValue*27+charCode)%arraySize;

            System.out.println("Hash Key Value " + hKVTemp
                    + " * 27 + Character Code " + charCode + " % arraySize "
                    + arraySize + " = " + hashKeyValue);

        }
        System.out.println();

        return hashKeyValue;
    }

}
