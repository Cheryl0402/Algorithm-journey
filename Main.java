package LeetcodeLearn;

import java.util.ArrayList;
import java.util.List;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        //my solution of pivot number
        int[] a ={3,6,1,0};
        int[] b = {};
        int[] c = {0};
        int[] d = {2};
       // System.out.println("The dominant index of array a is " + dominantIndex(a));
       // System.out.println("The dominant index of array b is " + dominantIndex(b));
      //  System.out.println("The dominant index of array c is " + dominantIndex(c));
        System.out.println("The array plus one is " );
        for(int item : plusOne(c)){
            System.out.print(item + " ");
        }


    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int p = digits.length - 1;

       //traverse array form the last int, if less than 9, plus 1 then return. if not, set the item into zero,
        // go to the next int
//        for(int i = n-1; i >= 0; i--){
//            if(digits[i] < 9){
//                digits[i]++;
//                return  digits;
//            }else{
//                digits[i] = 0;
//            }
//        }

        while(p >= 0){
            if(digits[p]  != 9){
                digits[p] ++;
                return digits;
            }else{
                digits[p] = 0;
                p--;
            }
        }

        System.out.println(p);
        // If travese ends and all numbers are set to 0, come to here, create a new array, set the first number to 1.
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;

       // }else if(i == 0 && digits[0] == 9 ){
        //                    int[] newDigits = new int[n + 1];
        //                    newDigits[0] = 1;
        //                }

    }

    /*
    public static int dominantIndex(int[] nums)  {
        if(nums.length == 0) return -1;
        int max = nums[0];
        int maxIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] * 2 > max && (i != maxIndex) ){
                return -1;
            }

        }return maxIndex;

    }
    */
}


        // My solution of spiral filling
        /*
        final int N = 3;
        final int M = 4;

        int[][] matrix = new int[N][M];
        int num = 1;
        // fillMatrix(matrix);
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                matrix[i][j] = num;
                System.out.print(matrix[i][j] + " ");
                num++;
            }
            System.out.println();
        }

        List<Integer> array = spiralOrder(matrix);
        for(int i = 0; i < array.size(); i ++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println("\n");


        int[][] myMatrix = new int[N][M];
        int n = myMatrix.length; // rows
        int m = myMatrix[0].length;   // columns
        int top = 0, left = 0, right = m - 1, bottom = n - 1, number = 1,counter = 0;
        int r, c;
        while(counter < n * m){

            // traverse right
            for(c = top; c <= right && counter < n * m; c++){
                myMatrix[top][c] = number;
                number++;
                counter++;

            }
            top++;
            System.out.println("The number is " + number);
            System.out.println("The counter is " + counter);

            // traverse down
            for(r = top; r <= bottom && counter < n * m; r++){
                myMatrix[r][right]= number;
                number++;
                counter++;
            }
            right--;
            System.out.println("The number is " + number);
            System.out.println("The counter is " + counter);

            // traverse left
            for(c = right; c >= left && counter < n * m; c--){
                myMatrix[bottom][c] = number;
                number++;
                counter++;
            }
            bottom--;
            System.out.println("The number is " + number);
            System.out.println("The counter is " + counter);

            // traverse up
            for(r = bottom; r >= top && counter < n * m; r--){
                myMatrix[r][left] = number;
                number++;
                counter++;

            }
            left++;
            System.out.println("The number is " + number);
            System.out.println("The counter is " + counter);
        }

        System.out.println("My matrix is: ");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static List<Integer> spiralOrder(int[][] matrix){
    //public static void fillMatrix(int[][] matrix){
        List<Integer> result = new ArrayList<Integer>();

        if(matrix == null || matrix.length == 0){ return result; }

        int n = matrix.length; // rows
        int m = matrix[0].length;   // columns
        int top = 0, left = 0, right = m - 1, bottom = n - 1;
        int r, c;

        while(result.size() < n * m){

            // traverse right
            for(c = top; c <= right && result.size() < n * m ; c++){
                result.add(matrix[top][c]);
            }
            top++;

            // traverse down
            for(r = top; r <= bottom && result.size() < n * m; r++){
                result.add(matrix[r][right]);
            }
            right--;

            // traverse left
            for(c = right; c >= left && result.size() < n * m; c--){
                result.add(matrix[bottom][c]);
            }
            bottom--;

            // traverse up
            for(r = bottom; r >= top && result.size() < n * m; r--){
                result.add(matrix[r][left]);
            }
            left++;
        }
        return result;
    }
}
*/
        /*
        int[][]myMatrix =new int[4][5];
        int num = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                num++;
                myMatrix[i][j] = num;
            }
        }


        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }


        int[][]matrix1 = new int[1][1];
        matrix1[0][0] = 1;
        int [] printArray = new int[1];
        printArray = findDiagonalOrder(matrix1);
        for(int i = 0; i < 1; i++){
            System.out.print(printArray[i] + " ");
        }
    }

    public static int[] findDiagonalOrder(int[][] matrix){
        if(matrix == null || matrix.length == 0) {
            return new int[0];
        }

        if(matrix.length == 1 && matrix[0].length == 1){
            int[] result = new int[1];
            result[0] = matrix[0][0];
            return result;
        }
        int N = matrix.length;  // rows
        int M = matrix[0].length; // columns
        int[]result = new int[N * M];

        int k = 0;   // array index;
        int i = 0, j = 0;
        boolean rightDirection = true;

        while(true){

            result[k]=matrix[i][j];
            System.out.println("k is " + k);
            System.out.println("i is " + i + ", j is " + j);

            if(rightDirection){
                i--;
                j++;
            }else{
                i++;
                j--;
            }
            k++;

            // right border check, go down and walk left direction
            if(j == M  ){
                rightDirection = false;
                i +=2;
                j--;
            }
            // bottom border, go right and walk right direction
            if(i == N){
                rightDirection = true;
                i--;
                j+=2;
            }

            //left order, go down and walk right
            if(j < 0  ){
                rightDirection = true;
                j++;
            }

            // up border, go right
            if(i < 0 ){
                rightDirection = false;
                i++;
            }

            if(i == (N-1) && j == (M-1)){
                result[k]=matrix[i][j];
                break;
            }
        }
        return result;
    }

}
    */
        /*
        int[][] matrix = new int[2][10];
        boolean leftDirection = true;

        int num = 1;
        int i = 0, j = 0;
        int leftTime = 0;
        int rightTime = 0;
        int upTime = 0;
        int downTime = 0;

        while (true) {

            System.out.println("i is: " + i);
            System.out.println("j is: " + j);
            matrix[i][j] = num;

            if (leftDirection) {
                i++;
                j--;
            } else {
                i--;
                j++;
            }
            num++;

            if (i == 2 ) {
                // down wall
                leftDirection = false;
                j+=2;
                i--;
                downTime++;
                System.out.println("Face down wall " + downTime +" time(s) i is " + i + " j is " + j);

            }
            if (j == -1 ) {
                // left wall
                leftDirection = false;
                j++;
                leftTime++;
                System.out.println("Face left wall " + leftTime +" time(s) i is " + i + " j is " + j);
            }
            if (j == 10) {
                // right wall
                leftDirection = true;
                i+=2;
                j--;
                rightTime++;
                System.out.println("Face right wall " + rightTime +" time(s) i is " + i + " j is " + j);

            }
            if (i == -1 ) {
                // up wall
                leftDirection = true;
                i++;
                upTime++;
                System.out.println("Face up wall " + upTime +" time(s) i is " + i + " j is " + j);

            }


            if (i == 1 && j == 9) {
                matrix[1][9] = num;
                break;
            }
        }

        System.out.println();
        System.out.println("Matrix output: ");
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println(" ");
        }
        */




      /*

       int[][] matrix = new int[3][7];
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);


        int[] newNumber = new int[0];
        System.out.print(newNumber);
        System.out.println(newNumber.length);

        for(int i : newNumber){
            System.out.print(i + " ");
        }

     */
       /*
        // 1. Initialize
        int[] a0 = new int[5];
        int[] a1 = {1, 2, 3};
        // 2. Get Length
        System.out.println("The size of a1 is: " + a1.length);
        // 3. Access Element
        System.out.println("The first element is: " + a1[0]);
        // 4. Iterate all Elements
        System.out.print("[Version 1] The contents of a1 are:");
        for (int i = 0; i < a1.length; ++i) {
            System.out.print(" " + a1[i]);
        }
        System.out.println();
        System.out.print("[Version 2] The contents of a1 are:");
        for (int item: a1) {
            System.out.print(" " + item);
        }
        System.out.println();
        // 5. Modify Element
        a1[0] = 4;
        // 6. Sort
        Arrays.sort(a1);
        */




/*    ArrayList

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // 1. initialize
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;                           // v1 == null
        // 2. cast an array to a vector
        Integer[] a = {0, 1, 2, 3, 4};
        v1 = new ArrayList<>(Arrays.asList(a));
        // 3. make a copy
        List<Integer> v2 = v1;                      // another reference to v1
        List<Integer> v3 = new ArrayList<>(v1);     // make an actual copy of v1
        // 3. get length
        System.out.println("The size of v1 is: " + v1.size());
        // 4. access element
        System.out.println("The first element in v1 is: " + v1.get(0));
        // 5. iterate the vector
        System.out.print("[Version 1] The contents of v1 are:");
        for (int i = 0; i < v1.size(); ++i) {
            System.out.print(" " + v1.get(i));
        }
        System.out.println();
        System.out.print("[Version 2] The contents of v1 are:");
        for (int item : v1) {
            System.out.print(" " + item);
        }
        System.out.println();
        // 6. modify element
        v2.set(0, 5);       // modify v2 will actually modify v1
        System.out.println("The first element in v1 is: " + v1.get(0));
        v3.set(0, -1);
        System.out.println("The first element in v1 is: " + v1.get(0));
        // 7. sort
        Collections.sort(v1);
        // 8. add new element at the end of the vector
        v1.add(-1);
        v1.add(1, 6);
        // 9. delete the last element
        v1.remove(v1.size() - 1);
    }
}
 */