import java.util.Scanner;
import java.util.*;

public class Array{
    public static void main(String[] args){

        //Declares array in integer format
        int[] array;
        char[] array1;
        String[] array2;

        //Create memory for 10 integer array
        array = new int[10];
        array1 = new char[10];
        array2 = new String[10];

        //Assign the value in array index
        array[0] = 10;
        array[1] = 10;

        array1[0] = 'h';
        array1[1] = 'o';

        array2[0] = "Hello";
        array2[1] = "World!";

        System.out.println("The first element of integer: " + array[0]);
        System.out.println("The first element of character: " + array1[0]);
        System.out.println("The first element of String: " + array2[0]);
    }
}