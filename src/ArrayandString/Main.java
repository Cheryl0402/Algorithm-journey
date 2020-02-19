package ArrayandString;

public class Main {

    public static void main(String[] args) {
        // Test case
        int[] testArray0 = {0};
        int[] testArray1 = {1, 2, 3};
        int[] testArray2 = {1, 2, 9};
        int[] testArray3 = {9,9,9};

        System.out.println("The test array 0 plus one is: ");
        for (int item : plusOne(testArray0))
            System.out.print(item + " ");

        System.out.println("\n" + "The test array 1 plus one is: ");
        for (int item : plusOne(testArray1))
            System.out.print(item + " ");

        System.out.println("\n" + "The test array 2 plus one is: ");
        for (int item : plusOne(testArray2))
            System.out.print(item + " ");

        System.out.println("\n" + "The test array 3 plus one is: ");
        for (int item : plusOne(testArray3))
            System.out.print(item + " ");
    }

    public static int[] plusOne(int[] digits) {
        //traverse array form the last int, if less than 9, plus 1 then return. if not, set the item into zero,
        // go to the next int
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return  digits;
            }
                digits[i] = 0;
        }

        // while loop solution
//        int p = digits.length - 1;
//        while (p >= 0) {
//            if (digits[p] != 9) {
//                digits[p]++;
//                return digits;
//            } else {
//                digits[p] = 0;
//                p--;
//            }
//        }

        // If traveser ends and all numbers are set to 0, come to here, create a new array, set the first number to 1.
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

}
