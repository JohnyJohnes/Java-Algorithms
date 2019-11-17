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

    public void bubbleSort(){

        for (int i = arraySize-1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j]> theArray[j+1]){
                    swapValues(j,j+1);
                }
            }
        }

    }

    public void swapValues(int index1,int index2){
        int temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }


    public void binarySearchForValue(int value){
        int lowIndex = 0;
        int highIndex = arraySize-1;
        while (lowIndex<=highIndex){
            int middleIndex = (lowIndex+highIndex)/2;
            if (theArray[middleIndex]<value)
                lowIndex = middleIndex+1;
            else if (theArray[middleIndex]>value)
                highIndex = middleIndex-1;
            else{

                System.out.println("Found at\t"+middleIndex);
                lowIndex = highIndex+1;
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < arraySize; i++) {
            int min = i;
            for (int j = i; j < arraySize; j++) {
                if(theArray[min]>theArray[j])
                    min = j;
            }
            swapValues(i,min);
        }
    }

    public void insertionSort(){
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = theArray[i];
            while ((j>0)&&(theArray[j-1] > toInsert)){
                theArray[j] = theArray[j-1];
                j--;
            }
            theArray[j] = toInsert;
        }
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

//        newArray.bubbleSort();

//        newArray.selectionSort();

        newArray.insertionSort();

        newArray.printArray();

        newArray.binarySearchForValue(11  );
    }


}
