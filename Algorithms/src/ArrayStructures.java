public class ArrayStructures {

    private int[] theArray = new int[50]; // Creates an array with 50 indexes

    private int arraySize = 10; // Elements in theArray


    // Fills the Array with random values

    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){

            // Random number 10 through 19

            theArray[i] = (int)(Math.random()*10)+10;

        }

    }

    // Prints the Array on the screen in a grid

    public void printArray(){

        System.out.println("----------");

        for(int i = 0; i < arraySize; i++){

            System.out.print("| " + i + " | ");

            System.out.println(theArray[i] + " |");

            System.out.println("----------");

        }

    }

    public int getValueAtIndex(int index){
        if((index>=0) && (index<=arraySize))
            return theArray[index];
        return 0;
    }

    public boolean doesArrayContainThisValue(int value){
        for (int arrVal :
                theArray) {
            if(arrVal == value)
                return true;
        }
        return false;
    }

    public void deleteIndex(int index){
        if((index>=0) && (index<=arraySize)){
            for (int i = index; i < arraySize - 1; i++) {
                theArray[i]=theArray[i+1];

            }
        }
        arraySize--;

    }

    public void insertValue(int value){
        if(arraySize<50){
            theArray[arraySize]=value;
            arraySize++;
        }
    }

    public String linearSearchForValue(int value){
        boolean  valueInArray = false;

        String indexWithValue = "";

        System.out.println("value found at indexes: \t");
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value){
                indexWithValue+=i+" ";
                valueInArray = true;
            }
        }
        if (!valueInArray)
            indexWithValue = "none";

        return  indexWithValue;
    }

    public static void main(String[] args){

        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();

        newArray.printArray();

        System.out.println(newArray.getValueAtIndex(-2));

        System.out.println(newArray.doesArrayContainThisValue(19));

        newArray.deleteIndex(4);

        newArray.printArray();

        newArray.insertValue(55);

        newArray.printArray();
        System.out.println(newArray.linearSearchForValue(11));
    }


}
