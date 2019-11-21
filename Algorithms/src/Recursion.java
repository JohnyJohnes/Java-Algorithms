public class Recursion {

    public static void main(String[] args){
        Recursion recursion = new Recursion();
        System.out.println("Final result: "+ recursion.getFactorial(10));
    }

    public int getFactorial(int number){
        System.out.println("Method " + number);
        if (number==1){
            System.out.println("Returned 1");
            return 1;
        }
        else {
            int result=number*getFactorial(number-1);

            System.out.println("Return " + result);

            return result;
        }
    }


//    Calculate triangular number with recursion
    public int getTriangularNumR(int number){

        System.out.println("Method " + number);

        if (number==1){

            System.out.println("Returned 1");

            return 1;
        }
        else {
            int result = number+ getTriangularNumR(number-1);

            System.out.print("Return " + result);

            System.out.println(" : " + number + " + getFactorial(" + number + " - 1)");

            return result;
        }

    }

    // Calculate triangular number not using recursion

    public int getTriangularNum(int number){

        int triangularNumber = 0;

        while(number > 0){

            triangularNumber = triangularNumber + number;


            number--;

        }

        // If number equals 3, you find TN by adding 3+2+1 = 6

        return triangularNumber;

    }
}
