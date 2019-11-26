import java.util.Arrays;

public class HashFunction {

    private String[] theArray;
    private int arraySize;
    private int itemsInArray = 0;

    HashFunction(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray,"-1");
    }

    public void hashFunction1(String[] stringForArray, String[] theArray){
        for (int i = 0; i < stringForArray.length; i++) {
            String newElementVal = stringForArray[i];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }

    public void hashFunction2(String[] stringForArray, String[] theArray){
        for (int i = 0; i < stringForArray.length; i++) {
            String newElementVal = stringForArray[i];

            int arrayIndex = Integer.parseInt(newElementVal)%(arraySize-1);

            System.out.println("Modulus Index= " + arrayIndex + " for value " + newElementVal);


            while (theArray[arrayIndex]!="-1"){
                arrayIndex++;

                System.out.println("Collision Try " + arrayIndex + " Instead");

                arrayIndex %= arraySize;
            }
            theArray[arrayIndex] = newElementVal;
        }
    }

    public String findKey(String key){

        int arrayIndexHash= Integer.parseInt(key)%(arraySize-1);

        while (theArray[arrayIndexHash] != "-1"){
            if (theArray[arrayIndexHash] == key){

                System.out.println(key + " was found in index " + arrayIndexHash);

                return theArray[arrayIndexHash];
            }
            arrayIndexHash++;
            arrayIndexHash %= arraySize;
        }
        return null;
    }

    public void displayTheHashTable() {

        int increment = 0;

        for (int m = 0; m < 3; m++) {

            increment += 10;

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                System.out.format("| %3s " + " ", n);

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                if (theArray[n].equals("-1"))
                    System.out.print("|      ");

                else
                    System.out
                            .print(String.format("| %3s " + " ", theArray[n]));

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

        }

    }

    public static void main(String[] args){
        HashFunction hashFunction = new HashFunction(60);


//        String[] elementsToAdd = { "1", "5", "17", "21", "26" };
//        hashFunction.hashFunction1(elementsToAdd,hashFunction.theArray);


        String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
                "235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321",
                "400", "415", "450", "50", "660", "624" };

        hashFunction.hashFunction2(elementsToAdd2, hashFunction.theArray);
        hashFunction.displayTheHashTable();
        hashFunction.findKey("660");
    }
}
