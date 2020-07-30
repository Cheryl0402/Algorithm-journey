import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        int[] array = {7,2,1,9,3,6,5};
        bubbleSort(array);
        for(int num : array){
            System.out.print(num + " ");
        }

    }

    public static void bubbleSort(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            int lastUnsorted = array.length - 1;
            for(int i = 0; i < lastUnsorted; i++){
                if(array[i] > array[i+1] ){
                    swap(array, i , i+1);
                    isSorted = false;
                }
            }
            lastUnsorted--; //improve the performance
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}