import java.util.Arrays;

public class Partitioning {

    private static int[] theArray;

    private static int arraySize;

    public Partitioning(int arraySize) {
        this.arraySize = arraySize;
        theArray = new int[arraySize];
        generateRandomArray();
    }

    public void partitionArray(int pivot){
        // If leftPointer finds an item that is greater
        // than pivot it stops and waits for the rightPointer
        // to find a value less than pivot. Then the items
        // are switched

        // Starts at the left side of array before index 0
        int leftPointer = -1;

        // Starts at the right side of the array after the last index

        int rightPointer = arraySize;
        while (true){
            // Cycle through array until the end is reached
            // or an item bigger than pivot is found. Then
            // wait for rightPointer to finish cycling
            while ((leftPointer<(arraySize-1)) && theArray[++leftPointer]<pivot)
                ;
            printHorzArray(leftPointer, rightPointer);

            System.out.println(theArray[leftPointer] + " in index "
                    + leftPointer + " is bigger than the pivot value " + pivot);

            // Cycle through array until the beginning is reached
            // or an item smaller than pivot is found.

            while ((rightPointer>0) && theArray[--rightPointer]>pivot)
                ;
            printHorzArray(leftPointer, rightPointer);

            System.out.println(theArray[rightPointer] + " in index "
                    + rightPointer + " is smaller than the pivot value "
                    + pivot);

            printHorzArray(leftPointer, rightPointer);

            // When the 2 pointers meet at the middle break
            // out of the while loop

            if (leftPointer>=rightPointer)
                break;
            else {
                // Swap the values in the pointers

                swapValues(leftPointer, rightPointer);

                System.out.println(theArray[leftPointer] + " was swapped for "
                        + theArray[rightPointer]);
            }

        }
    }

    public void swapValues(int indexOne, int indexTwo) {

        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;

    }


    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){

            // Random number 10 through 19

            theArray[i] = (int)(Math.random()*50)+10;

        }

    }

    static void printHorzArray(int i, int j) {

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print(String.format("| %2s " + " ", theArray[n]));

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        if (i != -1) {

            // Number of spaces to put before the F

            int spacesBeforeFront = 5 * i + 1;

            for (int k = 0; k < spacesBeforeFront; k++)
                System.out.print(" ");

            System.out.print("L");

            // Number of spaces to put before the R

            int spacesBeforeRear = (5 * j + 1 - 1) - spacesBeforeFront;

            for (int l = 0; l < spacesBeforeRear; l++)
                System.out.print(" ");

            System.out.print("H");

            System.out.println("\n");

        }

    }

    public static void main(String[] args){

        Partitioning partitionArray = new Partitioning(10);

        partitionArray.generateRandomArray();

        System.out.println(Arrays.toString(Partitioning.theArray));

        // Every item smaller than 35 will be on the left and
        // everything bigger will be on the right

        partitionArray.partitionArray(35);

        System.out.println(Arrays.toString(Partitioning.theArray));

    }

}
