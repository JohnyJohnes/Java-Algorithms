public class ShellSort {


    private int arraySize;
    private int[] theArray;

    ShellSort(int arraySize){
        this.arraySize = arraySize;

        theArray = new int[arraySize];

        generateRandomArray();
    }

    public void sort(){
        int inner, outer, temp;

        int interval =1;
        while (interval <= arraySize/3){
            interval = interval* 3+1;
        }
            while (interval>0){
                for(outer = interval;outer<arraySize;outer++){
                    temp = theArray[outer];

                    System.out.println("Copy into temp: "+theArray[outer]);

                    // inner is assigned the value of the highest index to check
                    // against all values the proceed it. Along the way if a
                    // number is greater than temp it will be moved up in the array

                    inner = outer;

                    System.out.println("Checking if " + theArray[inner - interval]
                            + " in index " + (inner - interval)
                            + " is bigger than " + temp);

                    // While there is a number bigger than temp move it further
                    // up in the array

                    while(inner > interval-1  && theArray[inner-interval]>=temp){
                        System.out.println("In While Checking if "
                                + theArray[inner - interval] + " in index "
                                + (inner - interval) + " is bigger than " + temp);

                        printHorzArray(inner, outer, interval);

                        // Make room for the smaller temp by moving values in the
                        // array
                        // up one space if they are greater than temp

                        theArray[inner] = theArray[inner-interval];

                        inner -=interval;

                        System.out.println("inner= " + inner);

                        printHorzArray(inner, outer, interval);

                        System.out.println("outer= " + outer);
                        System.out.println("temp= " + temp);
                        System.out.println("interval= " + interval);
                    }
                    // Now that everything has been moved into place put the value
                    // stored in temp into the index above the first value smaller
                    // than it is

                    theArray[inner] = temp;

                    System.out.println(temp + " moved to index " + inner);

                    printHorzArray(inner, outer, interval);
                }

                // Once we get here we have interval sorted our array
                // so we decrement interval and go again

                interval = (interval - 1) / 3;

        }
    }

    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){

            // Random number 10 through 19

            theArray[i] = (int)(Math.random()*50)+10;

        }

    }


    public void printHorzArray(int i, int j, int h) {

        if (i == j)
            i = i - h;

        for (int n = 0; n < 51; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++)
            System.out.print("-");

        System.out.println();

        if (i != -1) {

            // Number of spaces to put before the F

            int spacesBeforeFront = 5 * i + 1;

            for (int k = 0; k < spacesBeforeFront; k++)
                System.out.print(" ");

            System.out.print("I");

            // Number of spaces to put before the R

            int spacesBeforeRear = (5 * j + 1 - 1) - spacesBeforeFront;

            for (int l = 0; l < spacesBeforeRear; l++)
                System.out.print(" ");

            System.out.print("O");

            System.out.println("\n");

        }

    }

    public static void main(String[] args){

        ShellSort shellSort = new ShellSort(10);
        shellSort.sort();
    }

}
