package ArrayandString;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // Test case
        int[] testArray0 = {0};
        int[] testArray1 = {1, 2, 3};
        int[] testArray2 = {1, 2, 9};
        int[] testArray3 = {9,9,9};

//        System.out.println("The test array 0 plus one is: ");
//        for (int item : plusOne(testArray0))
//            System.out.print(item + " ");
<<<<<<< HEAD
//
//        System.out.println("\n" + "The test array 1 plus one is: ");
//        for (int item : plusOne(testArray1))
//            System.out.print(item + " ");
//
//        System.out.println("\n" + "The test array 2 plus one is: ");
//        for (int item : plusOne(testArray2))
//            System.out.print(item + " ");
//
//        System.out.println("\n" + "The test array 3 plus one is: ");
//        for (int item : plusOne(testArray3))
//            System.out.print(item + " ");

        System.out.println("");
        int[] myArr = {1,2,3,4,5,6,7};
        rotate(myArr,8);
        for(int i : myArr){
            System.out.println(i + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
      int len = nums.length;
      k = k % len;
      if(k == 0) return;

      int[] resultArr = new int[nums.length];
      int m = 0;
      for(int i = 0; i > 0; i--){

      }
=======

//        System.out.println(" ");
//        System.out.println("The triangle of list is: " );
//        for(List list : generate(5)){
//            System.out.println(list);
//        }

        String[] myStrs = {"flower","float","flight","flow"};
        String[] test = {"",""};
        System.out.println("the longest common prefix is: " + longestCommonPrefix(myStrs));
        System.out.println("the longest common prefix is: " + longestCommonPrefix(test));


        char[] s = {'a','b','c','d','e'};
        reverseString(s);
        System.out.println(s);

        //   System.out.println("The second row of list is: " + generate(5));

    }
    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;
        char temp;

        while(i < j){
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;

            i++;
            j--;
        }

>>>>>>> 554ed9213f4850c86c2f197cb956c76632a71407
    }


    public static String longestCommonPrefix(String[] strs) {

        // strs is empty
        if(strs.length == 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        String commonPrefix = new String();
        StringBuilder longestCommonPrefix = new StringBuilder();
        for(int i = 0; i < strs[0].length() ; i++){
            char currentLetter = strs[0].charAt(i);
         //   System.out.println("the current letter is " + currentLetter);

            for(int j = 0; j < strs.length; j++){
                if(strs[j].length() < i || strs[j].charAt(i) != currentLetter){
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(currentLetter);
        }

        return longestCommonPrefix.toString();

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> List = new ArrayList<List<Integer>>(numRows);
        List<Integer> previousRowList = new ArrayList<Integer>();

        if (numRows == 0) return List;

        // when numrows == 1 List index is 0
        previousRowList.add(1);
        List.add(previousRowList);

        for (int r = 1; r < numRows; r++) {  // why cannot I use List.size() instead of numRows.

            ArrayList<Integer> rowList = new ArrayList<Integer>();
            rowList.add(1); // when index is 1
            for (int c = 0; c < r -1; c++) {
                rowList.add(previousRowList.get(c) + previousRowList.get(c+1));
            }
            rowList.add(1);
            List.add(rowList);
            previousRowList = rowList;

        }
        return List;
    }




//        while(true){
//            if(numRows== 0)
//                return List;
//
//            List.add(previousRowList);
//            if(numRows == 1){
//                return List;
//            }
//            //starting from the second row.
//            for(int r = 2; r <= numRows;r++){
//                //inner list n
//                List<Integer> rowList = new ArrayList<Integer>();
//                rowList.add(1);     // the first element in the row list is 1.
//                // starting from the second element.
//                for(int c = 1; c < r -1; c++){
//                    rowList.add(previousRowList.get(c-1)+previousRowList.get(c));
//                }
//                rowList.add(1);
//                List.add(rowList);
//                previousRowList = rowList;
//            }return List;



//
//        int innerListSize = 1;
//        //  inner list 1 = List[0]
//        List<Integer> innerList1 = new ArrayList<Integer>( innerListSize);
//        innerList1.add(1);
//        innerListSize++;
//
//        // inner list 2
//        List<Integer> innerList2 = new ArrayList<Integer>(innerListSize );
//        innerList2.add(0,1);
//        innerList2.add(1,1);
//        innerListSize++;
//
//        //inner list 3
//        List<Integer> innerList3 = new ArrayList<Integer>(innerListSize );
//        innerList3.add(0,1);
//        innerList3.add(1,innerList2.get(0) + innerList2.get(1));
//        innerList3.add(2,1);
//        innerListSize++;
//
//        //inner list 4
//        List<Integer> innerList4 = new ArrayList<Integer>(innerListSize );
//        innerList4.add(0,1);
//        innerList4.add(1,innerList3.get(0) + innerList3.get(1));
//        innerList4.add(2, innerList3.get(1) + innerList3.get(2));
//        innerList4.add(3,1);
//
//        //inner list 5
//
//
//        List.add(innerList1);
//        List.add(innerList2);
//        List.add(innerList3);
//        List.add(innerList4);






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
