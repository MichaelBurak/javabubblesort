package com.company.bubsort;

//setting up general main public class within package
//public = visible to all classes, default is visible only to own package

public class Main {
    //main method and entry point, public = runtime can execute, static = belongs to the class and allows for a first call without an instance existing, void = no return value, once fully called --> executed, ends.
    //String[] args = accepts a single argument of type String array
    public static void main(String[] args){
        //setting int[] (array) named intArray of integers
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //for loop very similar to implementation in JS, begin at last index, move towards 0, decrementing
        for (int lastUnsortedI = intArray.length - 1; lastUnsortedI > 0;
             lastUnsortedI--) {
            //inner loop, setting incrementer to 0, if less than 0, increment through
            for(int i = 0; i < lastUnsortedI; i++)
                //if index being sorted is greater than index + 1, call swap
                if (intArray[i] > intArray[i +1])
                    swap(intArray, i, i +1);
        }
        //beginning at index 0, incrementing through length, print out sorted array
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]);
        }
    }

    //function to swap(sort) in bubble sort
    public static void swap(int[] array, int i, int j){
        //if indexes' integer values of compared indexes are equal, return
        if (i == j){
            return;
        }
        //implied else, set a temporary variable to first index value passed in, put second index value passed in in its place, put first index to second index
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

//syntax notes from working in JS & python most recently:
//public, class, static, void, int[] = array is init array, int temp is int assignment,
//return is as per JS